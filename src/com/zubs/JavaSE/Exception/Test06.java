package com.zubs.JavaSE.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 在方法声明的位置上使用throws关键字 谁调用这个方法就抛给谁
 * 
 */
public class Test06 {
	//一般不建议在main方法上使用throw 因为异常一旦发生，一定会抛给JVM JVM只用终止程序
	
	/*
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	*/
	
	public static void main(String[] args) {
		System.out.println("main begin");
		try{
			m1();
		}catch(FileNotFoundException e) {
			System.out.println("文件路径错误，或者文件不存在");
		}
		System.out.println("main over");
	}
	
	
	private static void m1() throws FileNotFoundException {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}
	private static void m2() throws FileNotFoundException {
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}
	private static void m3() throws FileNotFoundException {
		/*
		 * 这里编译报错的原因
		 * 这里调用的构造方法创建对象的时候 抛出了一个异常
		 * public FileInputStream(String name) throws FileNotFoundException
		 * 而FileNotFoundException的父类是IOException
		 * IOException的父类是Exception 
		 * 所以得到FileNotFoundException是编译时异常
		 * 必须进行处理 不处理编译器报错
		 */
		//new FileInputStream("D:\\bjpowernode.sql");
		
		//在方法声明的时候使用throws关键字进行上抛
		new FileInputStream("D:\\bjpowernode.sql");
	}
}






