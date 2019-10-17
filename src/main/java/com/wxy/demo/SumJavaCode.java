package com.wxy.demo;

import java.io.*;
import java.util.Objects;

/**
 * 　*
 * 　* @author LYZ
 * 　*
 */
public class SumJavaCode {

    private static long normalLines = 0; // 代码行
    private static long commentLines = 0; // 注释行
    private static long whiteLines = 0; // 空行

    public static void main(String[] args) {
        SumJavaCode sjc = new SumJavaCode();
        File f = new File("/home/wxy/IdeaProjects/panda-platform");
        System.out.println("软件名称：盼达智能车联网系统V1.1.2");
        sjc.treeFile(f);
        System.out.println("代码行(不含注释)：" + normalLines);
        System.out.println("代码行(含注释)：" + (normalLines + commentLines));
    }

    /**
     * 　* 查找出一个目录下所有的.java文件
     * 　*
     * 　* @param f 要查找的目录
     */
    private void treeFile(File f) {
        File[] childs = f.listFiles();
        for (File child : Objects.requireNonNull(childs)) {
            if (!child.isDirectory()) {
                if (child.getName().matches(".*\\.java$")) {
                    //System.out.println(childs[i].getName());
                    sumCode(child);
                }
            } else {
                treeFile(child);
            }
        }
    }

    /**
     * 　* 计算一个.java文件中的代码行，空行，注释行
     * 　*
     * 　* @param file
     * 　* 要计算的.java文件
     */
    private void sumCode(File file) {
        BufferedReader br = null;
        boolean comment = false;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            try {
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    if (line.matches(" ^[\\s&&[^\\n]]*$")) {
                        whiteLines++;// 空白行
                    } else if (line.startsWith("/*") && !line.endsWith("*/")) {
                        commentLines++;
                        comment = true;
                    } else if (comment) {
                        commentLines++;
                        if (line.endsWith("*/")) {
                            comment = false;
                        }
                    } else if (line.startsWith("//")) {
                        commentLines++;
                    } else {
                        normalLines++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}