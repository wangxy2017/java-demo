package com.wxy.demo.io;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

@Slf4j
public class FileDemo {
    public static void main(String[] args) throws IOException {
        // 相对路径文件
        File temp = new File("temp");
        log.info("path:{}", temp.getPath());
        log.info("absolutePath:{}", temp.getAbsolutePath());
        // 绝对路径文件
        File absoluteFile = temp.getAbsoluteFile();
        log.info("path:{}", absoluteFile.getPath());
        log.info("absolutePath:{}", absoluteFile.getAbsolutePath());
        // 标准文件
        File canonicalFile = temp.getCanonicalFile();
        log.info("path:{}", canonicalFile.getPath());
        log.info("absolutePath:{}", canonicalFile.getAbsolutePath());
        // 绝对路径文件
        File file = new File("/home");
        log.info("path:{}", file.getPath());
        log.info("absolutePath:{}", file.getAbsolutePath());
    }
}
