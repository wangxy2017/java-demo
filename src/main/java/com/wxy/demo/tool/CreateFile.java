package com.wxy.demo.tool;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;

/**
 * @Author sir
 * @Date 2019/12/3 16:41
 * @Description TODO 创建指定大小文件
 **/
public class CreateFile {
    public static void crate(long length) throws IOException {
        RandomAccessFile r = null;
        try {
            String filename = UUID.randomUUID().toString().replaceAll("-", "");
            r = new RandomAccessFile(new File(filename), "rw");
            r.setLength(length);
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
