package com.bit.management.manual_management.dao;

import com.bit.management.manual_management.entity.Datatype;
import com.bit.management.manual_management.entity.Datausage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface dataUsageDao {
  public Datausage getBySummaryId(Long id);

  public List<Long> getAllBySegment(String segment);

  public List<Long> getAllByRegistration(String registration);

  public List<Long> getAllByReconstruct(String reconstruct);

  public List<Long> getAllByVR(String VR);

  public List<Long> getAllByRestoration(String restoration);

  public List<Long> getAllByFeature(String feature);
}
