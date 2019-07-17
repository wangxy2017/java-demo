package com.wxy.demo.io;

import java.io.File;

/**
 * @Author wxy
 * @Date 19-7-17 上午9:27
 * @Description TODO
 **/
public class FileOperation {
    public static void main(String[] args) {
        // 获取子目录
        File file = new File("/home/wxy");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println((files[i].isDirectory() ? "d" : "f") + " => " + files[i].getName());
            }
        }
        // 读取文件
        File file1 = new File("/home/wxy/CoverageInfo");
        if (file1.exists()) {
            System.out.println(file1.getName());
        }
    }
}
