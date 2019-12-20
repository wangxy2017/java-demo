package com.wxy.demo.decorator;

/**
 * @Author sir
 * @Date 2019/12/20 15:21
 * @Description TODO
 **/
public class Dog implements Animal {
    @Override
    public void action() {
        System.out.println("吃饭");
    }
}
