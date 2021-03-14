package com.zubs.JavaSE.eight;
/*
 * 关于Integer的构造方法
 */
public class IntegerTest02 {
	public static void main(String[] args) {
		//将数字33转换为包装类型
		Integer x=new Integer(33);
		System.out.println(x);
		//将String类型数字转为Integer包装类型
		Integer y=new Integer("3423");
		System.out.println(y);
	}
}
