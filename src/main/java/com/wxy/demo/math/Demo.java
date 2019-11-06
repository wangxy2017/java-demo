package com.wxy.demo.math;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-6 上午11:00
 * @Description TODO
 **/
@Slf4j
public class Demo {
    public static void main(String[] args) {
        BigDecimal decimalNum = new BigDecimal(0);
        double doubleNum = 0;
        int loopCount = 1000000;
        //计算decimal类型数据的循环耗时
        long start = System.nanoTime();
        for (int i = 0; i < loopCount; i++) {
            decimalNum = decimalNum.add(new BigDecimal(1.8));
        }
        log.info("循环{}次的合计值: {},总共耗时为：{} ms", loopCount, decimalNum, (System.nanoTime() - start) / 1e6d);
        //计算double类型数据的循环耗时
        start = System.nanoTime();
        for (int i = 0; i < loopCount; i++) {
            doubleNum += 1.80;
        }
        log.info("循环{}次的合计值: {},总共耗时为：{} ms", loopCount, doubleNum, (System.nanoTime() - start) / 1e6d);
    }
}
