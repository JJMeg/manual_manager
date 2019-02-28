package com.bit.management.manual_management.controller;


import com.bit.management.manual_management.entity.User;
import com.bit.management.manual_management.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mybatis")
public class CRUDController {
  @Autowired
  private userService service;

  @RequestMapping("/addUser")
  public boolean addUser(User u) {
    u.setUserpwd("qaz");
    u.setUsername("qaz");
    u.setRoleid(0);
    int addStatus = service.addUser(u);
    return addStatus > 0;
  }

}
