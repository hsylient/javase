package com.zubs.JavaSE.Thread;
/*
 * �����ֳɵ�sleep����
 * static void sleep(long millis)  
 * ��̬����
 * �����Ǻ���
 * �������ý��̽�������״̬ ����ռ�е�CPUʱ��Ƭ �ø�����ʱ��
 */
public class Test06 {
	public static void main(String[] args) {
		//�õ�ǰ�߳̽�������
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//5��֮��ִ�����д���
		System.out.println("���");
	}
}
