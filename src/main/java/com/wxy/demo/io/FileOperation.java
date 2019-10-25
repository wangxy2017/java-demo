package com.wxy.demo.io;

import java.io.File;
import java.io.IOException;

/**
 * @Author wxy
 * @Date 19-7-17 上午9:27
 * @Description TODO
 **/
public class FileOperation {
    public static void main(String[] args) throws IOException {
        updateFile();
    }

    public static void test1() {
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
        // 获取父目录
        File file2 = new File("/home/wxy/.ssh");
        if (file2.exists()) {
            File parentFile = file2.getParentFile();
            System.out.println(parentFile.getPath());
        }
    }

    /**
     * 修改文件名
     *
     * @throws IOException
     */
    public static void updateFile() throws IOException {
        File file = new File("a.txt");
        file.createNewFile();
        File file1 = new File("b.txt");
        file.renameTo(file1);
    }
}
