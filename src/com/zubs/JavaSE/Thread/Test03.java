package com.zubs.JavaSE.Thread;

/*
 * ��дһ����ʵ�� java,lang.Runnable�ӿ�(�ϳ���)
 */
public class Test03 {
	public static void main(String[] args) {
		// ����һ�������еĶ���
		MyRunnable m = new MyRunnable();
		// ����������װ��һ���̶߳���
		Thread t = new Thread(m);
		t.start();
		// ����Ĵ��뻹�����������߳���
		for (int i = 0; i < 1000; i++) {
			System.out.println("���߳�-->" + i);
		}
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		// ��д���� ��һ�γ��������ڷ�֧ջ��
		for (int i = 0; i < 1000; i++) {
			System.out.println("��֧�߳�-->" + i);
		}
	}
}
