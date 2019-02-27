package com.bit.management.manual_management.service.Impl;

import com.bit.management.manual_management.dao.userDao;
import com.bit.management.manual_management.entity.user;
import com.bit.management.manual_management.service.userService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class userServiceImpl implements userService {
  @Autowired
  private userDao userDao;

  @Override
  public int addUser(user u) {
    return 0;
  }

  @Override
  public PageInfo<user> findAllUser(int pageNum, int pageSize) {
    PageHelper.startPage(pageNum, pageSize);
    List<user> userDomains = userDao.selectUsers();
    PageInfo result = new PageInfo(userDomains);
    return result;
  }
}
