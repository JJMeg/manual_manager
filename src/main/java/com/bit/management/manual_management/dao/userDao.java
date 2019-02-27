package com.bit.management.manual_management.dao;

import com.bit.management.manual_management.entity.user;

import java.util.List;

public interface userDao {

  int insert(user record);

  List<user> selectUsers();

}
