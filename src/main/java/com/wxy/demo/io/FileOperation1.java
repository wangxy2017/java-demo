package com.wxy.demo.io;

import java.io.File;
import java.io.IOException;

/**
 * @Author wxy
 * @Date 19-7-22 下午6:00
 * @Description TODO
 **/
public class FileOperation1 {
    public static void main(String[] args) throws IOException {
        // 创建文件
        File file = new File("aaa");
        if (!file.exists()) {
            file.createNewFile();
        }
        // 判断文件
        System.out.println(file.isFile());
        // 判断文件夹
        System.out.println(file.isDirectory());
        // 创建文件夹
        File file1 = new File("test/one/two");
        if (!file1.exists()) {
            file1.mkdir();
        }
        if (!file1.exists()) {
            file1.mkdirs();
        }
    }
}
