package com.bit.management.manual_management.service;

import com.bit.management.manual_management.entity.User;
import com.github.pagehelper.PageInfo;

public interface userService {
  void insert(User u);

  void addUser(User u);

  PageInfo<User> findAllUser(int pageNum, int pageSize);

  User getByUsername(String username);
}
