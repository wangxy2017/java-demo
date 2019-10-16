package com.wxy.demo.lombok;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author wxy
 * @Date 19-10-16 上午10:45
 * @Description TODO
 **/
@Slf4j
public class TestMain {
    public static void main(String[] args) {
        User user = User.builder().age(1).name("张三").build();
        log.info("user = {}",user);
    }
}
