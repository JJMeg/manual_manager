package com.bit.management.manual_management.controller;

import com.bit.management.manual_management.entity.User;
import com.bit.management.manual_management.entity.response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class userController {



  @RequestMapping("/getuser")
  @ResponseBody
  public User getuser() {
    User u = new User();
    u.setRoleid((byte)0);
    u.setUsername("Meg");
    u.setUserpwd("123123");
    return u;
  }

  @RequestMapping("/getuserJson")
  @ResponseBody
  public response getuserJson() {
    User u = new User();
    u.setRoleid((byte)0);
    u.setUsername("Meg");
    u.setUserpwd("123");
    return response.ok(u);
  }

  @RequestMapping("/getuserJsonTest")
  public String getuserJsonTest(ModelMap map) {
    User u = new User();
    u.setRoleid((byte)0);
    u.setUsername("Meg");
    u.setUserpwd("123");
    map.addAttribute("user", u);
    return "freemarker";
  }

  @RequestMapping("/testSQL")
  public User testSQL() {
//    user u = new user();
//    int addstatus = userService.insert(u);
//    if (addstatus > 0) {
//      return u;
//    }
    return null;
  }
}
