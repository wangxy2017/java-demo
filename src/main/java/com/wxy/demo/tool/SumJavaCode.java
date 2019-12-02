package com.wxy.demo.tool;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @Author wxy
 * @Date 19-10-16 下午5:16
 * @Description TODO 代码统计
 **/
@Slf4j
public class SumJavaCode {

    private static long normalLines = 0; // 代码行
    private static long commentLines = 0; // 注释行
    private static long whiteLines = 0; // 空行

    public static void main(String[] args) {
        final String projectName = "盼达智能车联网系统V1.1.2";
        final String projectPath = "/home/wxy/IdeaProjects/panda-platform";
        SumJavaCode sjc = new SumJavaCode();
        File f = new File(projectPath);
        sjc.treeFile(f);
        log.info("项目名称：{}", projectName);
        log.info("代码行：{}", normalLines);
        log.info("注释行：{}", commentLines);
        log.info("空白行：{}", whiteLines);
    }

    /**
     * 　* 查找出一个目录下所有的.java文件
     * 　*
     * 　* @param f 要查找的目录
     */
    private void treeFile(File f) {
        File[] childs = f.listFiles();
        for (File child : childs) {
            if (!child.isDirectory()) {
                if (child.getName().matches(".*\\.java$")) {
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
                    if (line.matches("^[\\s&&[^\\n]]*$")) {
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