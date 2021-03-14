package com.zubs.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class Test {
	public static void main(String[] args) {
		Statement stm = null;
		Connection con = null;
		try {
			// 注册驱动(第一个Driver是java中的接口 第二个Driver是mysql的实现类)
			//父类型引用指向子类对象 多态
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);//java.sql.DriverManager
			//获取连接
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);//java.sql.Connection
			System.out.println(con);
			//获取数据库操作对象
			stm = con.createStatement();
			//执行sql语句
			String sql="insert into dept(deptno,dname,loc) values(50,'人事部','北京')";
			//专门执行DML语句(增删改)
			//返回值是影响数据库中的记录条数
			int count = stm.executeUpdate(sql);
			System.out.println(count == 1 ? "保存成功" : "保存失败");
			// 处理查询结果
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 释放资源
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
