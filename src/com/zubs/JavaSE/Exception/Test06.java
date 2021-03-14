package com.zubs.JavaSE.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * �ڷ���������λ����ʹ��throws�ؼ��� ˭��������������׸�˭
 * 
 */
public class Test06 {
	//һ�㲻������main������ʹ��throw ��Ϊ�쳣һ��������һ�����׸�JVM JVMֻ����ֹ����
	
	/*
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	*/
	
	public static void main(String[] args) {
		System.out.println("main begin");
		try{
			m1();
		}catch(FileNotFoundException e) {
			System.out.println("�ļ�·�����󣬻����ļ�������");
		}
		System.out.println("main over");
	}
	
	
	private static void m1() throws FileNotFoundException {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}
	private static void m2() throws FileNotFoundException {
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}
	private static void m3() throws FileNotFoundException {
		/*
		 * ������뱨���ԭ��
		 * ������õĹ��췽�����������ʱ�� �׳���һ���쳣
		 * public FileInputStream(String name) throws FileNotFoundException
		 * ��FileNotFoundException�ĸ�����IOException
		 * IOException�ĸ�����Exception 
		 * ���Եõ�FileNotFoundException�Ǳ���ʱ�쳣
		 * ������д��� ���������������
		 */
		//new FileInputStream("D:\\bjpowernode.sql");
		
		//�ڷ���������ʱ��ʹ��throws�ؼ��ֽ�������
		new FileInputStream("D:\\bjpowernode.sql");
	}
}






