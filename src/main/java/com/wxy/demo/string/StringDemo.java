package com.wxy.demo.string;

/**
 * @Author wxy
 * @Date 19-9-16 下午4:00
 * @Description TODO
 **/
public class StringDemo {
    public static void main(String[] args) throws InterruptedException {
        byte[] bytes = "你好".getBytes();
        String str = new String(bytes);
        System.out.println(str);
    }
}
