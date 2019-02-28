package com.bit.management.manual_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//包扫描
@SpringBootApplication
//扫描mybatis mapper包路径
@MapperScan(basePackages = "com.bit.management.manual_management.mapper.*")
//@EnableTransactionManagement
public class ManualManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManualManagementApplication.class, args);
  }

}
