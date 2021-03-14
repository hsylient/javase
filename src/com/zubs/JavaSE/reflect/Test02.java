package com.zubs.JavaSE.reflect;
/*
 * 获取Class的作用
 */
public class Test02 {
	public static void main(String[] args) {
		//通过反射机制来获取Class
		try {
			Class c = Class.forName("com.zubs.JavaSE.zzz.Student");
			//这个c.newInstance()方法会调用Student的无参构造 来创建对象
			Object obj = c.newInstance();
			System.out.println(obj);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
