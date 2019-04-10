package com.bit.management.manual_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
  @RequestMapping(value = "/setServer")
  public String hello() {
    return "backend/data-detail.html";
  }
}
