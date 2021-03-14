package com.zubs.JavaSE.Thread;
/*
 * 编写一个类直接继承java.lang.Thread 重写run方法
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		//这是main方法这里是主线程
		//新建一个分支线程对象
		MyThread m= new MyThread();
		//启动线程
		m.start();
		//这里的代码还是运行在主线程中
		for (int i = 0; i <1000; i++) {
			System.out.println("主线程-->"+i);
		}
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		//编写程序 这一段程序运行在分支栈中
		for(int i=0; i<1000; i++) {
			System.out.println("分支线程-->"+i);
		}
	}
}















