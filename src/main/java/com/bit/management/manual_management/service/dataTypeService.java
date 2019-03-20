package com.bit.management.manual_management.service;

import com.bit.management.manual_management.entity.Datasummary;

import java.util.List;

public interface dataTypeService {
  public Datasummary getBySummaryId(Long id);

  public List<Long> getAllBySurProcedure(String surProcedure);

  public List<Long> getAllByImageSite(String imageSite);

  public List<Long> getAllByLesionType(String lesionType);

  public List<Long> getAllByImageType(String imageType);

  public List<Long> getAllBySource(String source);

  public List<Long> getAllByStage(String stage);

  public List<Long> getAllByGoldStandard(boolean goldStandard);

}
