package com.zqw.wendyadmin.image.utils;

import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.Base64;

/**
 * @Classname Base64Util
 * @Description Base64 图片转码工具
 * @Date 2019/10/31 21:39
 * @Created by zqw
 * @Version 1.0
 */
public class Base64Util {

    public static String fileToBase64(File file) {

        FileInputStream inputFile = null;
        byte[] buffer = null;
        try {
            inputFile = new FileInputStream(file);

            buffer = new byte[(int)file.length()];
            inputFile.read(buffer);
            inputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new BASE64Encoder().encode(buffer);
    }

    public static void base64ToFile(String base64, String fileName) {
        File file = null;
        //创建文件目录
        String filePath="D:\\image";
        File  dir=new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            byte[] bytes = Base64.getDecoder().decode(base64);
            file=new File(filePath+"\\"+fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
