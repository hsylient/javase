package com.zubs.JavaSE.Exception;
/*
 * 为什么以下的程序没有执行 你好
 * 在程序执行到第12行的时候发生了ArithmeticException(算术)异常
 * 在底层new了ArithmeticException异常对象，然后抛出
 * 由于是main方法调用了100/0 所以异常抛给了main方法
 * main方法没有处理，将这个异常抛给JVM
 * JVM终止程序的执行 所以 你好 没有执行
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.println(100/0);
		System.out.println("你好");
	}
}
