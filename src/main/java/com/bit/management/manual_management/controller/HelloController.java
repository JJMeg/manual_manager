package com.bit.management.manual_management.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/welcome")
public class HelloController {

  @RequestMapping(value = "/home")
  public String hello(){
    return "he.html";
  }

}