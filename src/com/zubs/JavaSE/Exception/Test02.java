package com.zubs.JavaSE.Exception;
/*
 * �쳣��java���������ʽ����
 * ÿһ���쳣�඼���Դ����쳣����
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		NumberFormatException nfe=new NumberFormatException("���ָ�ʽ���쳣");
		System.out.println(nfe);
		
		NullPointerException npe=new NullPointerException("�����˿�ָ���쳣");
		System.out.println(npe);
	}
}
