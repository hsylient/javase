package com.zubs.JavaSE.polymorphic02;

public class Test {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.move();
		
		Cat c = new Cat();
		c.move();
		c.catchMouse();
		
		Bird b = new Bird();
		b.move();
		
//		��Ҫ��ס������������������ת�� ������������ת�� ��������֮������м̳й�ϵ
		
		/*
		 * ��������ת��(upcasting)
		 * �����͡�������
		 * ����������ָ�������Ͷ���
		 * �ֱ���Ϊ�Զ�����ת��
		 */
		System.out.println("----------------------");
		Animal a2 = new Cat();
		a2.move();
		
		/**
		 * ��������ת��(downcasting)
		 * �����͡�������
		 * �ֱ���Ϊǿ������ת��
		 * ʲôʱ����Ҫ��������ת���أ�
		 * �������еĶ��� ��Ҫ���������������еķ���
		 */
		Cat c2 = (Cat) a2;
		c2.catchMouse();
		
		
		
		
		
		
		
//		�����͵�����ָ�������͡���̬��
		Animal a3=new Bird();
		Bird bbb=(Bird)a3;
		bbb.fly();
		/**
		 * 1�����³��������û������ģ���Ϊ��������鵽a3������������Animal
		 * Animal��Cat֮����ڼ̳й�ϵ������Animal�Ǹ��࣬Cat������
		 * ������ת���������ͽ�������ת�ͣ���Ҫǿ������ת��
		 * �﷨��ȷ
		 * 
		 * 2��������Ȼͨ���˱��� ���������н׶γ��ִ��� 
		 * ��Ϊ��JVM�Ķ��ڴ�����ʵ����һ��Bird���͵Ķ���
		 * Bird���͵Ķ����޷�ת����Cat���͵Ķ���
		 * ��Ϊ��������֮�䲻���ڼ̳й�ϵ��ʱ�������������쳣
		 * java.lang.ClassCastException
		 * ����ת���쳣 ͨ������������ת�͵�ʱ��ǿ������ת����
		 */
//		Cat c3=(Cat)a3;
		/**
		 * ��ν������ת���쳣��
		 * 	ʹ��instanceof��������Ա���������ϵ��쳣
		 * �﷨��ʽ��
		 * ���� instanceof ����������
		 * ���������ִ�н����boolean���� true false
		 * �������Ľ�����棺a�������ָ��Ķ�����һ��Animal����
		 * �������Ľ��Ϊ�٣�a�������ָ��Ķ����ǲ�һ��Animal����
		 */
		
		/**
		 * ��a3����ָ��Ķ���ȷʵ��һ��Cat����ʱ{
			Cat c3=(Cat)a3;
			}
		*/
		if(a3 instanceof Cat) {//�������һ��è��������ô�Ҿ�ת����è������(a3��һ��Cat���͵Ķ�����)
			Cat c3=(Cat)a3;
			c3.catchMouse();
		}
		else if(a3 instanceof Bird) {//�������һ�����������ô�Ҿ�ת�����������
			Bird b2=(Bird)a3;
			b2.fly();
		}
	}
}