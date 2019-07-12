package com.wxy.demo.string;

/**
 * @Author wxy
 * @Date 19-7-12 下午2:16
 * @Description 字符串操作
 **/
public class StringOperation {
    public static void main(String[] args) {
        // 1.indexOf（String str） 查找
        String str = "hello world";
        int index = str.indexOf("w");
        System.out.println(index);
        // 2.lastIndexOf(String str)	末尾查找
        int index1 = str.lastIndexOf("w");
        System.out.println(index1);
        // 3.charAt(int index) 索引查找
        char c = str.charAt(6);
        System.out.println(c);
        // 4.substring(int beginIndex,  int endIndex)  截取
        String substring = str.substring(0, 5);
        System.out.println(substring);
        // 5.replace(String old, String new)  替换
        String replace = str.replace("world", "boy");
        System.out.println(replace);
        // 6.startsWith(String prefix) 判断开始
        boolean bool = str.startsWith("h");
        System.out.println(bool);
        // 7.endsWith(String suffix) 判断结尾
        boolean bool1 = str.endsWith("d");
        System.out.println(bool1);
        // 8.toUpperCase() 转换大写
        String str1 = str.toUpperCase();
        System.out.println(str1);
        // 9.toLowerCase() 转换小写
        String str2 = str1.toLowerCase();
        System.out.println(str2);
        // 10.split(String sign) 分割
        String str3 = "a,b,c,d";
        String[] split = str3.split(",");
        System.out.println(toString(split));
        // 11.trim() 去空
        String str4 = "   a b cd     ";
        String trim = str4.trim();
        System.out.println(trim);
        // 12.equals(String otherstr) 判断相等
        String str5 = "hello";
        String str6 = "hello";
        System.out.println(str5.equals(str6));
        // 13.equalsIgnoreCase(String otherstr) 忽略大小写比较
        String str7 = "Hello";
        System.out.println(str5.equalsIgnoreCase(str7));
        // 14.getBytes() 获取bytes数组
        byte[] bytes = str7.getBytes();
        System.out.println(toString(bytes));
        // 15.toCharArray() 获取chars数组
        char[] chars = str7.toCharArray();
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
