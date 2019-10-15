package com.wxy.demo;

import java.io.*;

/**
 * 　*
 * 　* @author LYZ
 * 　*
 */
public class SumJavaCode {

    static long normalLines = 0; // 代码行
    static long commentLines = 0; // 注释行
    static long whiteLines = 0; // 空行

    public static void main(String[] args) {
        String[] resources = {"/home/wxy/IdeaProjects/panda-platform"};// 检索目录
        SumJavaCode sjc = new SumJavaCode();
        for (int i = 0; i < resources.length; i++) {
            File f = new File(resources[i]);
            System.out.println("目录：" + f.getName());
            sjc.treeFile(f);
            System.out.println("代码行：" + normalLines);
            System.out.println("注释行：" + commentLines);
            System.out.println("空行：" + whiteLines);
            // 重置
            normalLines = 0;
            commentLines = 0;
            whiteLines = 0;
        }
    }

    /**
     * 　* 查找出一个目录下所有的.java文件
     * 　*
     * 　* @param f 要查找的目录
     */
    private void treeFile(File f) {
        File[] childs = f.listFiles();
        for (int i = 0; i < childs.length; i++) {
            if (!childs[i].isDirectory()) {
                if (childs[i].getName().matches(".*\\.java$")) {
                    //System.out.println(childs[i].getName());
                    sumCode(childs[i]);
                }
            } else {
                treeFile(childs[i]);
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
                    } else if (true == comment) {
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