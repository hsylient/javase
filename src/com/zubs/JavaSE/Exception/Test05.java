package com.zubs.JavaSE.Exception;

public class Test05 {
	//��һ�ַ����ǣ��ڷ���������λ���ϼ������� �׸�������
	/*
	public static void main(String[] args) throws ClassNotFoundException {
		dosome();
	}
	*/
	
	//�ڶ��ַ����ǣ�ʹ��try..catch���в�׽
	public static void main(String[] args) {
		try {
			dosome();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void dosome() throws ClassNotFoundException{
		System.out.println("dosome����ִ����");
	}
}
