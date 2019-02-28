package com.bit.management.manual_management.dao;

import com.bit.management.manual_management.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface userDao {
//  Dao接口的方法需要与MapperXML对应

  User getByUsername(@Param("username") String username);

  void addUser(User record);

}
