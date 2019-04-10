package com.bit.management.manual_management.service;

import com.bit.management.manual_management.entity.Datasummary;

import java.util.List;

public interface DataHandlerService {
  public boolean add(String uri);
  public List<Datasummary> search(String search);
  public List<Datasummary> advancedSearch(String searchData);
  public List<String> searchWordId(String searchData);
  public List<String> searchWordIdByExpress(String data);
}
