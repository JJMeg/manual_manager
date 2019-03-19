package com.bit.management.manual_management.service;

import com.bit.management.manual_management.entity.Fileserver;

public interface fileServerService {
  public Fileserver getById(Long id);

  public Fileserver getByName(String name);

  public Fileserver getByIp(String ip);
}
