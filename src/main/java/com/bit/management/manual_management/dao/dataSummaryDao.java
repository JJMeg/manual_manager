package com.bit.management.manual_management.dao;

import com.bit.management.manual_management.entity.Datasummary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface dataSummaryDao {
  public Datasummary getById(Long id);

  public List<Datasummary> getByPatientName(String patientname);

  public List<Datasummary> getByPatientId(String patientid);

  public List<Datasummary> getByCreator(String creator);

  public List<Datasummary> getByFileName(String filename);

  public List<Datasummary> getByFileServer(int fileserver);
}
