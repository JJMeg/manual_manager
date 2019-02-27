package com.bit.management.manual_management.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionHandler {
  public static final String ERROR_VIEW = "error";//自定义错误页面

//	@ExceptionHandler(value = Exception.class)
//    public Object errorHandler(HttpServletRequest reqest,
//    		HttpServletResponse response, Exception e) throws Exception {
//
//    	e.printStackTrace();
//
//		ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", reqest.getRequestURL());
//        mav.setViewName(IMOOC_ERROR_VIEW);
//        return mav;
//    }

  @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
  public Object errorHandler(HttpServletRequest reqest,
                             HttpServletResponse response, Exception e) throws Exception {

    e.printStackTrace();

    if (isAjax(reqest)) {
      return response;
      // Exception
    } else {
      ModelAndView mav = new ModelAndView();
      mav.addObject("exception", e);
      mav.addObject("url", reqest.getRequestURL());
      mav.setViewName(ERROR_VIEW);
      return mav;
    }
  }

  /**
   *
   * @Title: IMoocExceptionHandler.java
   * @Package com.imooc.exception
   * @Description: 判断是否是ajax请求
   */
  public static boolean isAjax(HttpServletRequest httpRequest){
    return  (httpRequest.getHeader("X-Requested-With") != null
            && "XMLHttpRequest"
            .equals( httpRequest.getHeader("X-Requested-With").toString()) );
  }
}
