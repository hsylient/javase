package com.zubs.JavaSE.Exception;
/*
 * ���³�������н��Ϊ100
 * 	java�﷨����(��һЩ�﷨һ��˵�˾�һ��Ҫ����Ҫ��ȥ��)
 * 	1��java�еĴ���������϶��µ�˳�����ִ��
 * 	2��return���һ��ִ�У����������������
 */
public class Test13 {
	public static void main(String[] args) {
		System.out.println(m());
	}
	
	private static int m() {
		int i=100;
		try {
			return i;
		} finally {
			i++;
		}
	}
}
