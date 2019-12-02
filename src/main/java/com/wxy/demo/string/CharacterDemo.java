package com.wxy.demo.string;

/**
 * @Author wxy
 * @Date 19-8-12 下午5:57
 * @Description TODO
 **/
public class CharacterDemo {
    public static void main(String[] args) {
        // 字符
        char ch = 'a';
        System.out.println(ch);
        // Unicode字符
        char uChar = '\u039A';
        System.out.println(uChar);
        // char数组
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(chars);
        // 包装类型
        Character ch1 = new Character('a');
        System.out.println(ch1);
        // 是否是字母字符
        boolean letter = Character.isLetter(ch1);
        System.out.println(letter);
        // 是否是数值字符
        boolean digit = Character.isDigit(ch1);
        System.out.println(digit);
        // 换行符
        char n = '\n';
        System.out.println(n);
    }
}
