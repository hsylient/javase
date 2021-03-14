package com.zubs.JavaSE.Exception;
/*
 * finally
 */
public class Test12 {
	public static void main(String[] args) {
		try {
			System.out.println("你好");
			System.exit(0);//只有这个可以阻止fianlly语句
		} finally {
			System.out.println("haha");
		}
	}
}
