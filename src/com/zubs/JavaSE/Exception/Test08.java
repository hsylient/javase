package com.zubs.JavaSE.Exception;
/*
 * �쳣�����������õķ���
 * 1����ȡ�쳣�򵥵�������Ϣ
 * 		String s=exception.getMessage();
 * 2����ӡ�쳣׷��
 * 		exception.printStackTrace();
 */
public class Test08 {
	public static void main(String[] args) {
		NullPointerException e=new NullPointerException("��ָ���쳣");
		
		//��ȡ�쳣�򵥵�������Ϣ
		e.getMessage();//�õ����ǹ��췽������ȥ���ַ���
		System.out.println(e.getMessage());
		
		//��ӡ�쳣׷��
		//java��̨��ӡ�쳣��ջ׷����Ϣ��ʱ�򣬲������첽�̵߳ķ�ʽ��ӡ��
		e.printStackTrace();
		System.out.println("��ã�");
		
	}
}
















