package com.zubs.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * ע����������һ�ַ���
 * ԭ��������Ĵ��뷽����̬������� ������ؾͻ�ִ�о�̬������е����� �÷������ʵ�������
 * 			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
 */
public class Test02 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			//ע������
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ����
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
