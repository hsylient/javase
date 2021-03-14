package com.zubs.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 注册驱动的另一种方法
 * 原理是下面的代码方法静态代码块中 而类加载就会执行静态代码块中的内容 用反射机制实现类加载
 * 			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
 */
public class Test02 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);//java.sql.Connection
			System.out.println(con);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
