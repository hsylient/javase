package com.zubs.JavaSE.Exception;

public class Test04 {
	public static void main(String[] args) {
		//dosome();
		//直接调用dosome方法 编译器报错 没有处理异常 必须处理
		
	}
	
	/*
	 * dosome方法在方法声明的位置上使用了throws ClassNotFoundException
	 * 这表示在dosome方法执行的时候可能会发生ClassNotFoundException异常
	 * 叫做类没有找到异常 这个异常的父类是 Exception 所以ArithmeticException属于编译时异常
	 * 
	 */
	
	public static void dosome() throws ClassNotFoundException{
		System.out.println("dosome方法执行了");
	}
}
