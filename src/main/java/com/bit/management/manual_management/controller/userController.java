package com.bit.management.manual_management.controller;

import com.bit.management.manual_management.entity.response;
import com.bit.management.manual_management.entity.user;
import com.bit.management.manual_management.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class userController {



  @RequestMapping("/getuser")
  @ResponseBody
  public user getuser() {
    user u = new user();
    u.setRoleId(0);
    u.setUserName("Meg");
    u.setUserPwd("123123");
    return u;
  }

  @RequestMapping("/getuserJson")
  @ResponseBody
  public response getuserJson() {
    user u = new user();
    u.setRoleId(0);
    u.setUserName("Meg");
    u.setUserPwd("123");
    return response.ok(u);
  }

  @RequestMapping("/getuserJsonTest")
  public String getuserJsonTest(ModelMap map) {
    user u = new user();
    u.setRoleId(0);
    u.setUserName("Meg");
    u.setUserPwd("123");
    map.addAttribute("user", u);
    return "freemarker";
  }

  @RequestMapping("/testSQL")
  public user testSQL() {
//    user u = new user();
//    int addstatus = userService.insert(u);
//    if (addstatus > 0) {
//      return u;
//    }
    return null;
  }
}
