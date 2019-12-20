package com.wxy.demo.decorator;

/**
 * @Author sir
 * @Date 2019/12/20 15:22
 * @Description TODO
 **/
public class Decorator implements Animal {

    private Animal animal;

    public Decorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void action() {
        this.animal.action();
        System.out.println("睡觉");
    }
}
