package com.wxy.demo.string;

import java.util.Date;

/**
 * @Author wxy
 * @Date 19-9-17 下午2:38
 * @Description TODO
 **/
public class StringFormat {
    public static void main(String[] args) {
        System.out.println(String.format("Hi,%s", "王力"));
        System.out.println(String.format("Hi,%s:%s.%s", "王力", "王南", "王刚"));
        System.out.println(String.format("字母a的大写是：%c%n", 'A'));
        System.out.println(String.format("3>7的结果是：%b%n", false));
        System.out.println(String.format("100的一半是：%d%n", 100 / 2));
        System.out.println(String.format("100的16进制数是：%x%n", 100));
        System.out.println(String.format("100的8进制数是：%o%n", 100));
        System.out.println(String.format("50元的书打8.5折扣是：%f元%n", 50 * 0.85));
        System.out.println(String.format("上面价格的16进制数是：%a%n", 50 * 0.85));
        System.out.println(String.format("上面价格的指数表示：%e%n", 50 * 0.85));
        System.out.println(String.format("上面价格的指数和浮点数结果的长度较短的是：%g%n", 50 * 0.85));
        System.out.println(String.format("上面的折扣是%d%%%n", 85));
        System.out.println(String.format("字母A的散列码是：%h%n", 'A'));
        System.out.println(String.format("格式参数$的使用：%1$d,%2$s", 99, "abc"));
        System.out.println(String.format("显示正负数的符号：%+d与%d%n", 99, -99));
        System.out.println(String.format("最牛的编号是：%03d%n", 7));
        System.out.println(String.format("Tab键的效果是：% 8d%n", 7));
        System.out.println(String.format("整数分组的效果是：%,d%n", 9989997));
        System.out.println(String.format("一本书的价格是：%.5f元%n", 49.8));
        Date date = new Date();
        System.out.println(String.format("全部日期和时间信息：%tc%n", date));
        System.out.println(String.format("年-月-日格式：%tF%n",date));
        System.out.println(String.format("月/日/年格式：%tD%n",date));
        System.out.println(String.format("HH:MM:SS PM格式（12时制）：%tr%n",date));
        System.out.println(String.format("HH:MM:SS格式（24时制）：%tT%n",date));
        System.out.println(String.format("HH:MM格式（24时制）：%tR",date));
    }
}
