package com.zubs.JavaSE.reflect;
/*
 * ��ȡClass������
 */
public class Test02 {
	public static void main(String[] args) {
		//ͨ�������������ȡClass
		try {
			Class c = Class.forName("com.zubs.JavaSE.zzz.Student");
			//���c.newInstance()���������Student���޲ι��� ����������
			Object obj = c.newInstance();
			System.out.println(obj);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
