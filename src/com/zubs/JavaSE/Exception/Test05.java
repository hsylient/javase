package com.zubs.JavaSE.Exception;

public class Test05 {
	//第一种方法是：在方法声明的位置上继续上抛 抛给调用着
	/*
	public static void main(String[] args) throws ClassNotFoundException {
		dosome();
	}
	*/
	
	//第二种方法是：使用try..catch进行捕捉
	public static void main(String[] args) {
		try {
			dosome();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void dosome() throws ClassNotFoundException{
		System.out.println("dosome方法执行了");
	}
}
