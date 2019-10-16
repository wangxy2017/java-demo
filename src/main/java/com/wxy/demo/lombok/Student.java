package com.wxy.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author wxy
 * @Date 19-10-16 上午10:52
 * @Description TODO
 **/
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Student {
    String name;
    String sex;

    public static void main(String[] args) {
        Student student = new Student();
        log.debug("name = {}",student.name);
    }
}
