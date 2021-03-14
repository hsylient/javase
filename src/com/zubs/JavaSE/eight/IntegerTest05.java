package com.zubs.JavaSE.eight;
/*
 * 传入String返回int
 */
public class IntegerTest05 {
	public static void main(String[] args) {
		//static int parseInt(String s)  
		//静态方法 传入String返回int
		int a=Integer.parseInt("423");
		System.out.println(a);
		
		//java.lang.NumberFormatException
//		System.out.println(Integer.parseInt("小黄"));
		
		double s=Double.parseDouble("3.14");
		System.out.println(s+1);
		
		float f=Float.parseFloat("1.0");
		System.out.println(f+1);
		
		//把十进制转换为二进制
		//static String toBinaryString(int i)  
		String ss=Integer.toBinaryString(3);
		System.out.println("3转换为二进制的结果为"+ss);
		
	}
}








