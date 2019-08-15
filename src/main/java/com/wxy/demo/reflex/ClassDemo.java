package com.wxy.demo.reflex;

/**
 * @Author wxy
 * @Date 19-8-15 上午9:21
 * @Description TODO
 **/
public class ClassDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> c = Class.forName("com.wxy.demo.reflex.Person");
        Person person = (Person) c.newInstance();
        person.setName("张三");
        System.out.println(person.getName());
    }
}
