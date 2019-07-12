package com.wxy.demo.string;

/**
 * @Author wxy
 * @Date 19-7-12 下午2:16
 * @Description 字符串操作
 **/
public class StringOperation {
    public static void main(String[] args) {
        // 1.indexOf（String str） 查找
        String str1 = "hello world";
        int index = str1.indexOf("w");
        System.out.println(index);
        // 2.lastIndexOf(String str)	末尾查找
        String str2 = "hello world";
        int index1 = str2.lastIndexOf("w");
        System.out.println(index1);
        // 3.charAt(int index) 索引查找
        String str3 = "hello world";
        char c = str3.charAt(6);
        System.out.println(c);
        // 4.substring(int beginIndex,  int endIndex)  截取
        String str4 = "hello world";
        String substring = str4.substring(0, 5);
        System.out.println(substring);
        // 5.replace(String old, String new)  替换
        String str5 = "hello world";
        String replace = str5.replace("world", "boy");
        System.out.println(replace);
        // 6.startsWith(String prefix) 判断开始
        String str6 = "hello world";
        boolean bool = str6.startsWith("h");
        System.out.println(bool);
        // 7.endsWith(String suffix) 判断结尾
        String str7 = "hello world";
        boolean bool1 = str7.endsWith("d");
        System.out.println(bool1);
        // 8.toUpperCase() 转换大写
        String str8 = "hello world";
        String upperCase = str8.toUpperCase();
        System.out.println(upperCase);
        // 9.toLowerCase() 转换小写
        String str9 = "HELLO WORLD";
        String lowerCase = str9.toLowerCase();
        System.out.println(lowerCase);
        // 10.split(String sign) 分割
        String str10 = "a,b,c,d";
        String[] split = str10.split(",");
        System.out.println(toString(split));
        // 11.trim() 去空
        String str11 = "   a b cd     ";
        String trim = str11.trim();
        System.out.println(trim);
        // 12.equals(String otherstr) 判断相等
        String a = "hello";
        String b = "hello";
        System.out.println(a.equals(b));
        // 13.equalsIgnoreCase(String otherstr) 忽略大小写比较
        String a1 = "hello";
        String b1 = "HeLLo";
        System.out.println(a1.equalsIgnoreCase(b1));
        // 14.getBytes() 获取bytes数组
        String str14 = "hello";
        byte[] bytes = str14.getBytes();
        System.out.println(toString(bytes));
        // 15.toCharArray() 获取chars数组
        String str15 = "world";
        char[] chars = str15.toCharArray();
        System.out.println(toString(chars));
    }

    private static String toString(String[] strs) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]).append(",");
        }
        sb.deleteCharAt(sb.length() - 1).append("]");
        return sb.toString();
    }

    private static String toString(char[] chars) {
        String[] strs = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            strs[i] = chars[i] + "";
        }
        return toString(strs);
    }

    private static String toString(byte[] bytes) {
        String[] strs = new String[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            strs[i] = String.valueOf(bytes[i]);
        }
        return toString(strs);
    }
}
