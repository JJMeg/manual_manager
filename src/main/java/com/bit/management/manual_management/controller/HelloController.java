package com.bit.management.manual_management.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @RequestMapping(value = "/home")
  public String hello() {
    return "backend/data-detail.html";
  }

  @RequestMapping(value = "/register")
  public String register() {
    return "backend/register.html";
  }

  @RequestMapping(value = "/")
  public String welcome() {
    return "backend/login.html";
  }

}