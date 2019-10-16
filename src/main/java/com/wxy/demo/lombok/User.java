package com.wxy.demo.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @Author wxy
 * @Date 19-10-16 上午10:44
 * @Description TODO
 **/
@Data
@Builder
@ToString
public class User {
    String name;
    int age;
}
