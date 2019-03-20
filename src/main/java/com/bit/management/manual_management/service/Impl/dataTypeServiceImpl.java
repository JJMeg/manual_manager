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
    return dataTypeDao.getBySummaryId(id);
  }

  @Override
  public List<Long> getAllBySurProcedure(String surProcedure) {
    return dataTypeDao.getAllBySurProcedure(surProcedure);
  }

  @Override
  public List<Long> getAllByImageSite(String imageSite) {
    return dataTypeDao.getAllByImageSite(imageSite);
  }

  @Override
  public List<Long> getAllByLesionType(String lesionType) {
    return dataTypeDao.getAllByLesionType(lesionType);
  }

  @Override
  public List<Long> getAllByImageType(String imageType) {
    return dataTypeDao.getAllByImageType(imageType);
  }

  @Override
  public List<Long> getAllBySource(String source) {
    return dataTypeDao.getAllBySource(source);
  }

  @Override
  public List<Long> getAllByStage(String stage) {
    return dataTypeDao.getAllByStage(stage);
  }

  @Override
  public List<Long> getAllByGoldStandard(boolean goldStandard) {
    return dataTypeDao.getAllByGoldStandard(goldStandard);
  }
}
