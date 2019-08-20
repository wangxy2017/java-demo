package com.wxy.demo.jdbc;

import java.sql.*;

/**
 * @Author wxy
 * @Date 19-8-20 下午2:27
 * @Description TODO
 **/
public class MysqlDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_demo?useSSL=false&serverTimezone=UTC", "root", "root");
        Statement stmt = conn.createStatement();
        String sql = "select id,name,url from websites";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            // 通过字段检索
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String url = rs.getString("url");

            // 输出数据
            System.out.print("ID: " + id);
            System.out.print(", 站点名称: " + name);
            System.out.print(", 站点 URL: " + url);
            System.out.print("\n");
        }
        // 完成后关闭
        rs.close();
        stmt.close();
        conn.close();
    }
}
