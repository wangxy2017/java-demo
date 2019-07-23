package com.wxy.demo.entity;

public enum Day1 {

    SUNDAY("星期日"),
    MONDAY("星期一"),
    THESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六");

    private final String value;

    Day1(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
