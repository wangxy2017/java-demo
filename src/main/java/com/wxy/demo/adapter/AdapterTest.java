package com.wxy.demo.adapter;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-7 下午6:23
 * @Description TODO
 **/
public class AdapterTest {
    public static void main(String[] args) {
//        Target target = new ClassAdapter();
//        target.request();
    }

    // 目标接口
    interface Target {
        void request();
    }

    // 适配者接口
    class Adaptee {
        public void specificRequest() {
            System.out.println("适配者中业务代码被调用...");
        }
    }

    // 类适配器类
    class ClassAdapter extends Adaptee implements Target {
        @Override
        public void request() {
            super.specificRequest();
        }
    }
}
