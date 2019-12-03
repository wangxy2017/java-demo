package com.wxy.demo;

import com.wxy.demo.tool.CreateFile;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author sir
 * @Date 2019/12/2 11:00
 * @Description TODO
 **/
@Slf4j
public class TestDemo {
    public static void main(String[] args) throws IOException {
        CreateFile.crate(50*1024*1024L);
    }


}
