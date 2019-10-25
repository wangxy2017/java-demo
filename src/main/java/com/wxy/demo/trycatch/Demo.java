package com.wxy.demo.trycatch;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Demo().test());
    }

    private int test() {
        int a = 0;
        try {
            a = 10;
            throw new RuntimeException();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return a = 20;
        } finally {
            return a = 30;
        }
    }
}
