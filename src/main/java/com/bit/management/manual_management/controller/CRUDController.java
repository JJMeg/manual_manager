package com.bit.management.manual_management.controller;


import com.bit.management.manual_management.entity.User;
import com.bit.management.manual_management.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mybatis")
public class CRUDController {
  @Autowired
  private userService userService;

  @RequestMapping("/addUser")
  public boolean addUser(User u) {
    u.setUserpwd("123");
    u.setUsername("123");
    u.setRoleid((byte)0);

    return true;
  }

  @RequestMapping("/getUser")
  @ResponseBody
  public User getUser() {
    User u = userService.getByUsername("qaz");
    return u;
  }
}
