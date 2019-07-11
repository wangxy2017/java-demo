package com.wxy.demo.singletion;

/**
 * @Author wxy
 * @Date 19-7-11 下午3:51
 * @Description 懒汉模式
 **/
public class Lazy {

    private Lazy() {
        System.out.println("创建Lazy对象");
    }

    // 使用volatile关键字，禁止指令排序
    private static volatile Lazy lazy;

    // 调用的时候创建
    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
