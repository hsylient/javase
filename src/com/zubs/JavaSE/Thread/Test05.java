package com.zubs.JavaSE.Thread;
/*
 * ��ȡ�ֳɵ�����
 * �޸��ֳɵ�����
 * 
 */
public class Test05 {
	public static void main(String[] args) {
		//��ȡ��ǰ�߳�
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());//main
		//�����̶߳���
		MyThread02 m=new MyThread02();
		MyThread02 m2=new MyThread02();
		//��ȡ�̵߳�����
		System.out.println(m.getName());//Thread-0Ĭ�ϵ��߳�����
		//�޸��̵߳�����
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
			System.out.println("��֧�̵߳�����"+thread.getName());
		}
	}
}