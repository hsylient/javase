package com.zubs.JavaSE.eight;
/*
 * ��JDK1.5�Ժ�֧���Զ�����Ͳ���
 */
public class IntegerTest04 {
	public static void main(String[] args) {
		//�Զ�װ��
		Integer y=100;
		//�Զ�����
		int x=y;
		System.out.println("��֤�Ƿ����"+x);
		Integer m=34;
		//+�����ǻ����������� m�ǰ�װ�� ��������Զ�����
		//==Ҳ�Զ�������
		System.out.println(m+1);
		Integer n=34;
		System.out.println(m==n);//true
		
		/*
		 * java��Ϊ����߳����۵�Ч�ʽ�-128-127֮������а�װ������ǰ������
		 * ���ڷ������ڴ�ĳ�������
		 * Ŀ��������������ֵ����Ҫnewֱ��ʹ�þͺ���
		 */
		Integer a=128;
		Integer b=128;
		System.out.println(a==b);//false
		
		Integer c=127;
		Integer d=127;
		System.out.println(c==d);//true

	}
}
