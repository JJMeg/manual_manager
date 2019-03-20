package com.bit.management.manual_management.service.Impl;

import com.bit.management.manual_management.dao.dataTypeDao;
import com.bit.management.manual_management.entity.Datasummary;
import com.bit.management.manual_management.service.dataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dataTypeService")
public class dataTypeServiceImpl implements dataTypeService {

  @Autowired
  private dataTypeDao dataTypeDao;

  @Override
  public Datasummary getBySummaryId(Long id) {
    return null;
  }

  @Override
  public List<Long> getAllBySurProcedure(String surProcedure) {
    return null;
  }

  @Override
  public List<Long> getAllByImageSite(String imageSite) {
    return null;
  }

  @Override
  public List<Long> getAllByLesionType(String lesionType) {
    return null;
  }

  @Override
  public List<Long> getAllByImageType(String imageType) {
    return null;
  }

  @Override
  public List<Long> getAllBySource(String source) {
    return null;
  }

  @Override
  public List<Long> getAllByStage(String stage) {
    return null;
  }

  @Override
  public List<Long> getAllByGoldStandard(boolean goldStandard) {
    return null;
  }
}
