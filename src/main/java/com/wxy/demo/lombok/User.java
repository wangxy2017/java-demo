package com.wxy.demo.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author wxy
 * @Date 19-10-16 上午10:44
 * @Description TODO
 **/
@Data
@Builder
@ToString
@Slf4j
public class User {
    String name;
    int age;

    public static void main(String[] args) {
        User user = User.builder().age(1).name("张三").build();
        log.info("user = {}", user);
    }
}
