package com.letpep.common.demo;

import java.io.File;

public class BY {
    public static void main(String[] args) {
        traverseFile("d:/1");

        }


    public static void traverseFile(String path){
        File file = new File(path);
        if(file.exists()){
            File[] fileArray = file.listFiles();
            for(File f : fileArray){
                if(f.isDirectory()){

                    System.out.println("文件夹："+f.getAbsolutePath());

                    traverseFile(f.getAbsolutePath());
                }else{
                    System.out.println("文件："+f.getAbsolutePath());
                }
            }
        }else{
            System.out.println("文件不存在！");
        }
    }
}
