package com.wxy.demo.reflex;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author wangxiaoyuan
 * @Date 19-11-6 下午5:27
 * @Description TODO
 **/
@Slf4j
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 测试Class.forName()
        Class<?> c = Class.forName("com.wxy.demo.reflex.Person");
        log.info("class name : {}", c.getName());
        // 测试T.class
        Class<Person> c1 = Person.class;
        log.info("class name : {}", c1.getName());
        // 测试Object.getClass()
        Person person = new Person();
        log.info("class name : {}", person.getClass().getName());
        // 测试newInstance()
        Class<?> c2 = Class.forName("com.wxy.demo.reflex.Person");
        Person person1 = (Person) c2.newInstance();
        log.info("person = {}", person1.toString());
    }
}
