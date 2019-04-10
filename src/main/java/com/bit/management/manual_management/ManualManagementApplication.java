package com.bit.management.manual_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//包扫描
@SpringBootApplication(scanBasePackages = {"com.bit.management.manual_management.controller","com.bit.management.manual_management.service"})
//扫描mybatis mapper包路径
@MapperScan(basePackages = "com.bit.management.manual_management.mapper.*")

public class ManualManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManualManagementApplication.class, args);
  }

}
