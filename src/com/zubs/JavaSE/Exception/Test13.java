package com.zubs.JavaSE.Exception;
/*
 * 以下程序的运行结果为100
 * 	java语法规则(有一些语法一旦说了就一定要按照要求去做)
 * 	1、java中的代码必须自上而下的顺序进行执行
 * 	2、return语句一旦执行，整个方法必须结束
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
