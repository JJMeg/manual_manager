package com.bit.management.manual_management.service.Impl;

import com.bit.management.manual_management.entity.User;
import com.bit.management.manual_management.service.userService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
  @Override
  public int insert(User u) {
    return 0;
  }

  @Override
  public int addUser(User u) {
    return 0;
  }

  @Override
  public PageInfo<User> findAllUser(int pageNum, int pageSize) {
    return null;
  }

//  @Autowired
// // private userDao userDao;
//
//  @Override
//  public int insert(user u) {
//    u.setUserName("testtest");
//    u.setUserPwd("qazwsx");
//    u.setRoleId(0);
//    int addStatus = userDao.insert(u);
//    return addStatus;
//  }
//
//  @Override
//  public PageInfo<user> findAllUser(int pageNum, int pageSize) {
//    PageHelper.startPage(pageNum, pageSize);
//    List<user> userDomains = userDao.selectUsers();
//    PageInfo result = new PageInfo(userDomains);
//    return result;
//  }


}
