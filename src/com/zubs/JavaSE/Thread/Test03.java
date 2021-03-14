package com.zubs.JavaSE.Thread;

/*
 * 编写一个类实现 java,lang.Runnable接口(较常用)
 */
public class Test03 {
	public static void main(String[] args) {
		// 创建一个可运行的对象
		MyRunnable m = new MyRunnable();
		// 将这个对象封装成一个线程对象
		Thread t = new Thread(m);
		t.start();
		// 这里的代码还是运行在主线程中
		for (int i = 0; i < 1000; i++) {
			System.out.println("主线程-->" + i);
		}
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		// 编写程序 这一段程序运行在分支栈中
		for (int i = 0; i < 1000; i++) {
			System.out.println("分支线程-->" + i);
		}
	}
}
