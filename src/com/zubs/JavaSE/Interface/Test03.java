package com.zubs.JavaSE.Interface;
/*
 * 1���ӿںͽӿ�֮���Ƕ�̳�
 * 2�������֮���ǵ��̳� 
 * 3���ӿڵĶ�̳��ֲ��������൥�̳е�ȱ��
 */
public class Test03 {
	public static void main(String[] args) {
		//��̬ ����������ָ�������Ͷ���
		Aa a=new Dd();
		Bb b=new Dd();
		Cc c=new Dd();
		
		a.m1();
//		a.m2 ������뱨�� 
//		�������aȥ��m2������Ҫ����ת��
		Bb b2=(Bb)a;
		b2.m2();
	}

}

interface Aa{
	void m1();
}
interface Bb{
	void m2();
}
interface Cc{
	void m3();
}
//��Ķ�ӿ�ʵ��   �������ڶ�̳�
class Dd implements Aa,Bb,Cc{
	//ÿһ���ӿ��еķ�����Ҫ��д
	public void m1() {
		System.out.println("����Dd���е�m1����");
	}
	public void m2() {
		System.out.println("����Dd���е�m2����");
	}
	public void m3() {
		System.out.println("����Dd���е�m3����");
	}
}


