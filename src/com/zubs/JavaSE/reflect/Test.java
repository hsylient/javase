package com.zubs.JavaSE.reflect;

import java.sql.Date;

/*
 * 反射机制
 * 通过java语言中的反射机制可以操作字节码文件
 * 可以读和修改class文件
 * 反射机制相关的重要的类
 * java.lang.Class 字节码文件
 * java.lang.reflect.Method 字节码中的方法
 * java.lang.reflect.Constructor 构造方法
 * java.lang.reflect.Field 属性
 */
/*
 * 想要操作一个类的字节码 就要先获取这个类
 * Class.forName()
 * 1、静态方法
 * 2、方法的参数是一个字符串
 * 3、参数是一个完整的类名
 * 4、完整的类名需要包名
 */
public class Test {
	public static void main(String[] args) {
		//方法一:c就代表String.class文件 或者说c代表String类型
		Class c=null;
		Class ccc=null;
		try {
			c=Class.forName("java.lang.String");
			ccc=Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//方法二：java中任何一个方法都有一个方法叫做getClass();
		String s="abc";
		Class cc=s.getClass();
		System.out.println(cc==c);//true 对象的内存地址一样 代表cc与 c都代表String.class文件
		
		//方法三:java中任何一个类都有class属性
		Class a = String.class;
		Class b = Date.class;
		System.out.println(a==cc);
	}
}


