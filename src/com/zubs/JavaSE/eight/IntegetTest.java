package com.zubs.JavaSE.eight;
/*
 * 1、八中基本数据类型的包装类
 * 	基本数据类型			  包装类型
 * 	  byte			  java.lang.Byte(父类Number)
 * 	  short			  java.lang.Short(父类Number)
 * 	  int			  java.lang.Integer(父类Number)
 * 	  long			  java.lang.Long(父类Number)
 * 	  float			  java.lang.Float(父类Number)
 * 	  double		  java.lang.Double(父类Number)
 * 	  boolean		  java.lang.Boolean(父类Object)
 * 	  char			  java.lang.Character(父类Object) 	
 * 2、主要讲解Integer
 * 3、八种包装类中其中六个都是包装类，他们的父类都是Number
 * 4、Number是一个抽象类，无法实例化
 * 5、基本数据类型转换为引用数据类型叫做装箱
 * 6、引用数据类型转换为基本数据类型叫拆箱
 */

public class IntegetTest {
	public static void main(String[] args) {
		//23是个基本数据类中 进行构造方法的包装 达到了基本数据类型向引用数据类型进行转换
		//基本数据类型转换为引用数据类型
		Integer in=new Integer(23);
		
		//将引用数据类型转换为引用数据类型
		float f=in.floatValue();
		System.out.println(f);//23.0
		
		int ii=in.intValue();
		System.out.println(ii);
	}
}








