package com.bit.management.manual_management.Analysis;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class yaml2Uri {
  public File getYamlFile(String dirPath) {
    String filePrefix = ".yaml";
    File dirFile = new File(dirPath);
    if (!dirFile.exists() || !dirFile.isDirectory()) {
      return null;
    }
    for (File f : dirFile.listFiles()) {
      System.out.println(f.getName());
      if (f.getName().contains(filePrefix)) {
        return f;
      }
    }
    return null;
  }


  public Map<String, String> analyseYaml(File yamlFile) throws IOException {
    if (yamlFile == null)
      return null;
    Yaml yaml = new Yaml();
    Map<String, String> jsonMap = yaml.load(new FileInputStream(yamlFile));
    System.out.println(jsonMap.toString());
    return jsonMap;
  }

  public static void main(String[] args) throws Exception {
    yaml2Uri yaml2Uri = new yaml2Uri();
    File ff = yaml2Uri.getYamlFile("/Users/jjmeg/IdeaProjects/manual_management/src/main/java/com/bit/management/manual_management/Analysis");
    yaml2Uri.analyseYaml(ff);
//    Map<String, String> map = yaml2Uri.analyseYaml(new File("/Users/jjmeg/IdeaProjects/manual_management/src/main/java/com/bit/management/manual_management/Analysis/test.yaml"));
//
//    System.out.println(map.toString());
//    Yaml yaml = new Yaml();
//    File f = new File("/Users/jjmeg/IdeaProjects/manual_management/src/main/java/com/bit/management/manual_management/Analysis/test.yaml");
//    //读入文件
//    Map<String, Object> map1 = yaml.load(new FileInputStream(f));
//    //System.out.println(result.getClass());
//    JSONObject jsonObject=new JSONObject(map1);
//    System.out.println(jsonObject);
//    File ff = yaml2Uri.getYamlFile("/Users/jjmeg/IdeaProjects/manual_management/src/main/java/com/bit/management/manual_management/Analysis");
//    System.out.println(ff);
  }
}
