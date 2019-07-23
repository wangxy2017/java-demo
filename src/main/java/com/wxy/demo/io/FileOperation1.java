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
        File file = new File("aaa");
        file.createNewFile();
        System.out.println(file.exists());

        File file1 = new File("test/one/two");
        if (!file1.exists()) {
            file1.mkdir();
        }
        if (!file1.exists()) {
            file1.mkdirs();
        }
    }
}
