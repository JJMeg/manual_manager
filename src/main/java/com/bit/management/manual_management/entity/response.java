package com.bit.management.manual_management.entity;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Title: LeeJSONResult.java
 * @Package com.lee.utils
 * @Description: 自定义响应数据结构
 * 这个类是提供给门户，ios，安卓，微信商城用的
 * 门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 其他自行处理
 * 200：表示成功
 * 500：表示错误，错误信息在msg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 502：拦截器拦截到用户token出错
 * 555：异常抛出信息
 */
public class response {

  // 定义jackson对象
  private static final ObjectMapper MAPPER = new ObjectMapper();

  // 响应业务状态
  private Integer status;

  // 响应消息
  private String msg;

  // 响应中的数据
  private Object data;

  private String ok;  // 不使用

  public static response build(Integer status, String msg, Object data) {
    return new response(status, msg, data);
  }

  public static response ok(Object data) {
    return new response(data);
  }

  public static response ok() {
    return new response(null);
  }

  public static response errorMsg(String msg) {
    return new response(500, msg, null);
  }

  public static response errorMap(Object data) {
    return new response(501, "error", data);
  }

  public static response errorTokenMsg(String msg) {
    return new response(502, msg, null);
  }

  public static response errorException(String msg) {
    return new response(555, msg, null);
  }

  public response() {

  }

//    public static LeeJSONResult build(Integer status, String msg) {
//        return new LeeJSONResult(status, msg, null);
//    }

  public response(Integer status, String msg, Object data) {
    this.status = status;
    this.msg = msg;
    this.data = data;
  }

  public response(Object data) {
    this.status = 200;
    this.msg = "OK";
    this.data = data;
  }

  public Boolean isOK() {
    return this.status == 200;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  /**
   * @param jsonData
   * @param clazz
   * @return
   * @Description: 将json结果集转化为LeeJSONResult对象
   * 需要转换的对象是一个类
   */
  public static response formatToPojo(String jsonData, Class<?> clazz) {
    try {
      if (clazz == null) {
        return MAPPER.readValue(jsonData, response.class);
      }
      JsonNode jsonNode = MAPPER.readTree(jsonData);
      JsonNode data = jsonNode.get("data");
      Object obj = null;
      if (clazz != null) {
        if (data.isObject()) {
          obj = MAPPER.readValue(data.traverse(), clazz);
        } else if (data.isTextual()) {
          obj = MAPPER.readValue(data.asText(), clazz);
        }
      }
      return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
    } catch (Exception e) {
      return null;
    }
  }

  /**
   * @param json
   * @return
   * @Description: 没有object对象的转化
   */
  public static response format(String json) {
    try {
      return MAPPER.readValue(json, response.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @param jsonData
   * @param clazz
   * @return
   * @Description: Object是集合转化
   * 需要转换的对象是一个list
   */
  public static response formatToList(String jsonData, Class<?> clazz) {
    try {
      JsonNode jsonNode = MAPPER.readTree(jsonData);
      JsonNode data = jsonNode.get("data");
      Object obj = null;
      if (data.isArray() && data.size() > 0) {
        obj = MAPPER.readValue(data.traverse(),
                MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
      }
      return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
    } catch (Exception e) {
      return null;
    }
  }

  public String getOk() {
    return ok;
  }

  public void setOk(String ok) {
    this.ok = ok;
  }

}