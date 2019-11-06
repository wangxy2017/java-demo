package com.wxy.demo.time;

import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-6 上午11:38
 * @Description TODO
 **/
@Slf4j
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        log.info("date类型：{}",date);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        log.info("timestamp类型：{}",timestamp);
    }
}
