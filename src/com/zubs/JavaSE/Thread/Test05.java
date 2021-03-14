package com.zubs.JavaSE.Thread;
/*
 * 获取现成的名字
 * 修改现成的名字
 * 
 */
public class Test05 {
	public static void main(String[] args) {
		//获取当前线程
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());//main
		//创建线程对象
		MyThread02 m=new MyThread02();
		MyThread02 m2=new MyThread02();
		//获取线程的名字
		System.out.println(m.getName());//Thread-0默认的线程名字
		//修改线程的名字
		m.setName("TTT");
		System.out.println(m.getName());//TTT
		m.start();
		m2.start();
		
	}
}

class MyThread02 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Thread thread=Thread.currentThread();
			System.out.println("分支线程的名字"+thread.getName());
		}
	}
}