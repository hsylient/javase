package com.zubs.JavaSE.Thread;
/*
 * 关于现成的sleep方法
 * static void sleep(long millis)  
 * 静态方法
 * 参数是毫秒
 * 作用是让进程进入阻塞状态 放弃占有的CPU时间片 让给其他时间
 */
public class Test06 {
	public static void main(String[] args) {
		//让当前线程进入休眠
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//5秒之后执行这行代码
		System.out.println("你好");
	}
}
