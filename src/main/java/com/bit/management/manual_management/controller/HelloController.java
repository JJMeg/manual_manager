package com.bit.management.manual_management.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class HelloController {

  @RequestMapping(value = "/home")
  public String hello() {
    return "backend/data-detail.html";
  }

  @RequestMapping(value = "/register")
  public String register() {
    return "register";
  }

//  @RequestMapping(value = "/")
//  public String welcome() {
//    return "login";
//  }

//  @RequestMapping(value = "/login")
//  public String login() {
//    return "login.html";
//  }

  @RequestMapping(value = "/index")
  public String index() {
    return "index.html";
  }

  @ResponseBody
  @RequestMapping("/menu-form")
  public JSONArray crfWordResolveTest() throws IOException {

    JSONArray jsonObject = JSONArray.parseArray("[" +
                "    {'name':'用户管理','children':[" +
                "    {'id':'user-tree', 'name':'用户管理', 'target':'navtab', 'url':'html/form/user-tree.html'}" +
                "    ]}" +
            "    {'name':'数据导入', 'children':[" +
            "        {'id':'word-input', 'name':'文本数据导入', 'target':'navtab', 'url':'html/form/wordinput.html'}," +
            "        {'id':'img-nput', 'name':'影像数据导入', 'target':'navtab', 'url':'html/form/imginput.html'}," +
//                "        {'id':'img-view', 'name':'文本数据详细', 'target':'navtab', 'url':'html/form/wordview.html'}," +
            "    ]}," +
            "    {'name':'数据检索', 'children':[" +
            "        {'id':'wordsearch', 'name':'文本数据检索', 'target':'navtab', 'url':'html/form/wordsearch.html'}" +
            "        {'id':'imgsearch', 'name':'影像数据检索', 'target':'navtab', 'url':'html/form/imgsearch.html'}" +
            "    ]}" +
                "    {'name':'日志管理','children':[" +
                "    {'id':'user-tree', 'name':'日志管理', 'target':'navtab', 'url':'html/form/user-tree.html'}" +
                "    ]}" +
            "]");

    return jsonObject;
  }


}