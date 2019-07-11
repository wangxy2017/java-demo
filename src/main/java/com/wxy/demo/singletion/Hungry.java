package com.wxy.demo.singletion;

/**
 * @Author wxy
 * @Date 19-7-11 下午3:48
 * @Description 饿汉模式
 **/
public class Hungry {

    private Hungry() {
        System.out.println("创建Hungry对象");
    }

    // 类加载的时候创建
    private static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }
}
