package com.zubs.JavaSE.Exception;
/*
 * finally
 */
public class Test12 {
	public static void main(String[] args) {
		try {
			System.out.println("���");
			System.exit(0);//ֻ�����������ֹfianlly���
		} finally {
			System.out.println("haha");
		}
	}
}
