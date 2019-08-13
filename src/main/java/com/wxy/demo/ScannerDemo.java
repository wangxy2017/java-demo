package com.wxy.demo;

import java.util.Scanner;

/**
 * @Author wxy
 * @Date 19-8-13 下午6:00
 * @Description TODO
 **/
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(scan.hasNext()){
            System.out.println(scan.next());
        }
        scan.close();
    }
}
