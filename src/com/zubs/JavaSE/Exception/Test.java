package com.zubs.JavaSE.Exception;
/*
 * 异常处理机制的作用是：增强程序的健壮性，怎么做到即使异常发生了，程序依然可以运行
 * 
 * 关于java中的异常
 * 以下的程序发生了不正常的情况，而这种不正常的情况叫做：异常
 * java将不正常的情况打印在控制台上，以便程序员进行修改，使程序更加健壮
 * 
 * 对应现实生活就是：火灾是一个类
 * 异常对象：2015年小明家着火了
 * 		  2043年小刚家着火了
 * 		  2020年小李家着火了
 * *****所有的异常都是发生在运行阶段*******
 * Error一旦发生java程序只有一个结果就是终止程序退出JAVM 错误不能处理
 * exception的所有子类都叫做编译时异常，必须在编写程序的时候处理，如果不处理编译器报错
 * RuntimeException运行时异常，可以选择性的处理或者不处理
 * 
 * java中对异常的处理有两种方式
 * 	1、在方法声明的位置上使用throws关键字 抛给上一级
 * 	2、使用try...catch语句进行异常的捕捉
 */
public class Test {
	public static void main(String[] args) {
		/*
		int a=10;
		int b=0;
		int c=a/b;//实际上JVM执行到这里的时候会创建异常对象new ArithmeticException("/ by zero");并打印输出到控制台上
		System.out.println(a+"/"+b+"="+c);
		*/
	
		//以上的程序存在异常需要进行修改
		int a=10;
		int b=0;
		if(b==0) {
			System.out.println("除数不能为零");
			return;	//后面的语句不执行
		}
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);		
	}
}
