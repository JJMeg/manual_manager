package com.bit.management.manual_management.service;

import com.bit.management.manual_management.entity.User;
import com.github.pagehelper.PageInfo;

public interface userService {
  int insert(User u);

  int addUser(User u);

  PageInfo<User> findAllUser(int pageNum, int pageSize);


}
