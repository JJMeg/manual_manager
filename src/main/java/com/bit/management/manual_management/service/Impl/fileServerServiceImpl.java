package com.bit.management.manual_management.service.Impl;

import com.bit.management.manual_management.dao.fileServerDao;
import com.bit.management.manual_management.entity.Fileserver;
import com.bit.management.manual_management.service.fileServerService;
import org.springframework.beans.factory.annotation.Autowired;

public class fileServerServiceImpl implements fileServerService {

  @Autowired
  private fileServerDao fileServerDao;

  @Override
  public Fileserver getById(Long id) {
    return fileServerDao.getById(id);
  }

  @Override
  public Fileserver getByName(String name) {
    return fileServerDao.getByName(name);
  }

  @Override
  public Fileserver getByIp(String ip) {
    return fileServerDao.getByIp(ip);
  }
}
