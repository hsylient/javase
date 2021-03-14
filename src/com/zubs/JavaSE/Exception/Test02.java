package com.zubs.JavaSE.Exception;
/*
 * 异常在java中以类的形式存在
 * 每一个异常类都可以创建异常对象
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		NumberFormatException nfe=new NumberFormatException("数字格式化异常");
		System.out.println(nfe);
		
		NullPointerException npe=new NullPointerException("发生了空指针异常");
		System.out.println(npe);
	}
}
