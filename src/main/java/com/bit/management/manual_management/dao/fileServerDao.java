package com.bit.management.manual_management.dao;

import com.bit.management.manual_management.entity.Datasummary;
import com.bit.management.manual_management.entity.Fileserver;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface fileServerDao {
  public Fileserver getById(Long id);

  public Fileserver getByName(String name);

  public Fileserver getByIp(String ip);

}
