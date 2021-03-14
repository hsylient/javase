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
			// ע������(��һ��Driver��java�еĽӿ� �ڶ���Driver��mysql��ʵ����)
			//����������ָ��������� ��̬
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);//java.sql.DriverManager
			//��ȡ����
			String url = "jdbc:mysql://localhost:3306/bjpowernode";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);//java.sql.Connection
			System.out.println(con);
			//��ȡ���ݿ��������
			stm = con.createStatement();
			//ִ��sql���
			String sql="insert into dept(deptno,dname,loc) values(50,'���²�','����')";
			//ר��ִ��DML���(��ɾ��)
			//����ֵ��Ӱ�����ݿ��еļ�¼����
			int count = stm.executeUpdate(sql);
			System.out.println(count == 1 ? "����ɹ�" : "����ʧ��");
			// �����ѯ���
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// �ͷ���Դ
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
