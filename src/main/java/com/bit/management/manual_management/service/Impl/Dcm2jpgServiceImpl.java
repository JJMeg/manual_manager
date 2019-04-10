package com.bit.management.manual_management.service.Impl;

import com.bit.management.manual_management.service.Dcm2jpgService;
import ij.plugin.DICOM;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Dcm2jpgServiceImpl implements Dcm2jpgService {
  @Override
  public void create(String filePath, String sPath) {
    try {
      DICOM dicom = new DICOM();
      dicom.run(filePath);
      BufferedImage bi = (BufferedImage) dicom.getImage();
      ImageIO.write(bi, "jpg", new File(sPath));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
