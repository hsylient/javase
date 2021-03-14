package com.zubs.JavaSE.Exception;
/*
 * 异常对象两个常用的方法
 * 1、获取异常简单的描述信息
 * 		String s=exception.getMessage();
 * 2、打印异常追踪
 * 		exception.printStackTrace();
 */
public class Test08 {
	public static void main(String[] args) {
		NullPointerException e=new NullPointerException("空指针异常");
		
		//获取异常简单的描述信息
		e.getMessage();//得到的是构造方法传进去的字符串
		System.out.println(e.getMessage());
		
		//打印异常追踪
		//java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的
		e.printStackTrace();
		System.out.println("你好！");
		
	}
}
















