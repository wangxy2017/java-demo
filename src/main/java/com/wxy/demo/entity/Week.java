package com.wxy.demo.entity;

/**
 * @Author wxy
 * @Date 19-8-19 下午4:34
 * @Description TODO
 **/
public enum Week {
    SUNDAY("星期日"),
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
