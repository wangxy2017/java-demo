package com.wxy.demo.decorator;

/**
 * @Author sir
 * @Date 2019/12/20 15:24
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.action();
        Decorator decorator = new Decorator(dog);
        decorator.action();
    }
}
