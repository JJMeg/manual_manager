package com.bit.management.manual_management.service;

import com.bit.management.manual_management.entity.user;
import com.github.pagehelper.PageInfo;

public interface userService {
  int insert(user u);

  PageInfo<user> findAllUser(int pageNum, int pageSize);


}
