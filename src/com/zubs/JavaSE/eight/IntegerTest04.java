package com.zubs.JavaSE.eight;
/*
 * 在JDK1.5以后支持自动封箱和拆箱
 */
public class IntegerTest04 {
	public static void main(String[] args) {
		//自动装箱
		Integer y=100;
		//自动拆箱
		int x=y;
		System.out.println("验证是否拆箱"+x);
		Integer m=34;
		//+两边是基本数据类型 m是包装类 在这里会自动拆箱
		//==也自动拆箱了
		System.out.println(m+1);
		Integer n=34;
		System.out.println(m==n);//true
		
		/*
		 * java中为了提高程序眼的效率将-128-127之间的所有包装对象以前创建好
		 * 放在方法区内存的常量池中
		 * 目的是在这个区间的值不需要new直接使用就好了
		 */
		Integer a=128;
		Integer b=128;
		System.out.println(a==b);//false
		
		Integer c=127;
		Integer d=127;
		System.out.println(c==d);//true

	}
}
