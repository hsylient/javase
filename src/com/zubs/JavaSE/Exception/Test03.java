package com.zubs.JavaSE.Exception;
/*
 * Ϊʲô���µĳ���û��ִ�� ���
 * �ڳ���ִ�е���12�е�ʱ������ArithmeticException(����)�쳣
 * �ڵײ�new��ArithmeticException�쳣����Ȼ���׳�
 * ������main����������100/0 �����쳣�׸���main����
 * main����û�д���������쳣�׸�JVM
 * JVM��ֹ�����ִ�� ���� ��� û��ִ��
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.println(100/0);
		System.out.println("���");
	}
}
