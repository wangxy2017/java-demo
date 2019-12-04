package com.wxy.demo;

import com.wxy.demo.tool.CreateFile;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @Author sir
 * @Date 2019/12/2 11:00
 * @Description TODO
 **/
@Slf4j
public class TestDemo {
    public static void main(String[] args) throws IOException {
        while (true){
            CreateFile.create(50*1024*1024L);
        }
    }


}
