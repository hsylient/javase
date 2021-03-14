package com.zubs.JavaSE.Thread;

/*
 * ��κ������ֹһ���̵߳�ִ��
 */
public class Test07 {
	public static void main(String[] args) {
		MyRunnable02 m = new MyRunnable02();
		Thread t = new Thread(m);
		t.start();

		// ģ��5����ֹ��֧�߳�
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		m.run = false;
	}
}

class MyRunnable02 implements Runnable {
	// ��һ���������
	boolean run = true;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if (run) {
				System.out.println("��֧�߳�" + i);
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