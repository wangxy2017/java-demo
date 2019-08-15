package com.wxy.demo.db;

import java.util.Arrays;

/**
 * @Author wxy
 * @Date 19-8-15 下午2:57
 * @Description TODO
 **/
public class View {
    private String name;
    private String[] title;
    private String[][] content;

    public void createView(String name, String title) {
        this.name = name;
        this.title = title.split(",");
        this.content = new String[0][this.title.length];
    }

    public void insertOne(String row) {
        String[] split = row.split(",");
        String[][] copyOf = Arrays.copyOf(this.content, this.content.length + 1);
        copyOf[copyOf.length - 1] = split;
        this.content = copyOf;
    }

    public void print() {
        for (int i = 0; i < this.title.length; i++) {
            System.out.print(this.title[i] + "\t");
        }
        System.out.print('\n');
        for (int i = 0; i < this.content.length; i++) {
            String[] row = this.content[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + "\t");
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        View view = new View();
        view.createView("sys_user", "id,name,age,salary");
        for (int i = 0; i < 10000; i++) {
            view.insertOne("1,2,3,4");
        }
        view.print();
    }
}
