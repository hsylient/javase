package com.zubs.JavaSE.Exception;

public class Test04 {
	public static void main(String[] args) {
		//dosome();
		//ֱ�ӵ���dosome���� ���������� û�д����쳣 ���봦��
		
	}
	
	/*
	 * dosome�����ڷ���������λ����ʹ����throws ClassNotFoundException
	 * ���ʾ��dosome����ִ�е�ʱ����ܻᷢ��ClassNotFoundException�쳣
	 * ������û���ҵ��쳣 ����쳣�ĸ����� Exception ����ArithmeticException���ڱ���ʱ�쳣
	 * 
	 */
	
	public static void dosome() throws ClassNotFoundException{
		System.out.println("dosome����ִ����");
	}
}
