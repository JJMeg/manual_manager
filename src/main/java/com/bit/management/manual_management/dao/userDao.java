package com.bit.management.manual_management.dao;

import com.bit.management.manual_management.entity.User;

import java.util.List;

public interface userDao {

  int insert(User record);

  User selectUsers(User record);

  List<User> selectUsers();

  int addUser(User record);

}
