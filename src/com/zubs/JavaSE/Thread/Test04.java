package com.zubs.JavaSE.Thread;

/*
 * ���������ڲ���ķ�ʽ
 */
public class Test04 {
	public static void main(String[] args) {
		// �����̶߳���ʹ�������ڲ���ķ�ʽ
		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("��֧�߳�" + i);
				}
			}
		});
		//�����߳�
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("���߳�" + i);
		}
	}
}
