package com.bit.management.manual_management.service;

import com.bit.management.manual_management.entity.Datasummary;

import java.util.List;

public interface dataSummaryService {
  public Datasummary getById(Long id);

  public List<Datasummary> getByPatientName(String patientname);

  public List<Datasummary> getByPatientId(String patientid);

  public List<Datasummary> getByCreator(String creator);

  public List<Datasummary> getByFileName(String filename);

  public List<Datasummary> getByFileServer(int fileserver);
}
