package com.bit.management.manual_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class loginController {
  @RequestMapping(value = "/")
  public String hello() {
    return "login.html";
  }

}
