package com.zubs.JavaSE.Thread;

/*
 * 如何合理的终止一个线程的执行
 */
public class Test07 {
	public static void main(String[] args) {
		MyRunnable02 m = new MyRunnable02();
		Thread t = new Thread(m);
		t.start();

		// 模拟5秒终止分支线程
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		m.run = false;
	}
}

class MyRunnable02 implements Runnable {
	// 打一个布尔标记
	boolean run = true;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if (run) {
				System.out.println("分支线程" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			else {
				return;
			}

		}

	}
}