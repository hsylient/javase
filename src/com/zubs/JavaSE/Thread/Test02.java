package com.zubs.JavaSE.Thread;
/*
 * ��дһ����ֱ�Ӽ̳�java.lang.Thread ��дrun����
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		//����main�������������߳�
		//�½�һ����֧�̶߳���
		MyThread m= new MyThread();
		//�����߳�
		m.start();
		//����Ĵ��뻹�����������߳���
		for (int i = 0; i <1000; i++) {
			System.out.println("���߳�-->"+i);
		}
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		//��д���� ��һ�γ��������ڷ�֧ջ��
		for(int i=0; i<1000; i++) {
			System.out.println("��֧�߳�-->"+i);
		}
	}
}















