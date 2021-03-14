package com.zubs.JavaSE.reflect;

import java.sql.Date;

/*
 * �������
 * ͨ��java�����еķ�����ƿ��Բ����ֽ����ļ�
 * ���Զ����޸�class�ļ�
 * ���������ص���Ҫ����
 * java.lang.Class �ֽ����ļ�
 * java.lang.reflect.Method �ֽ����еķ���
 * java.lang.reflect.Constructor ���췽��
 * java.lang.reflect.Field ����
 */
/*
 * ��Ҫ����һ������ֽ��� ��Ҫ�Ȼ�ȡ�����
 * Class.forName()
 * 1����̬����
 * 2�������Ĳ�����һ���ַ���
 * 3��������һ������������
 * 4��������������Ҫ����
 */
public class Test {
	public static void main(String[] args) {
		//����һ:c�ʹ���String.class�ļ� ����˵c����String����
		Class c=null;
		Class ccc=null;
		try {
			c=Class.forName("java.lang.String");
			ccc=Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//��������java���κ�һ����������һ����������getClass();
		String s="abc";
		Class cc=s.getClass();
		System.out.println(cc==c);//true ������ڴ��ַһ�� ����cc�� c������String.class�ļ�
		
		//������:java���κ�һ���඼��class����
		Class a = String.class;
		Class b = Date.class;
		System.out.println(a==cc);
	}
}


