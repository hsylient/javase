package com.zubs.JavaSE.Interface;

/*
 * �ӿ�Ҳ��һ�������������ͣ����Ե�ͬ������  �ӿ��ڱ���֮��Ҳ����class�ļ�
 * 	1����ζ���ӿ�
 * 		�����η���interface �ӿ���{}
 * 	2���ӿ���ֻ��ֻ��ֻ��ֻ��ֻ�ܰ�������������
 * 		����		public static final PI=3.14;
 * 		���󷽷�	public abstract ����();
 * 	3���ӿ���һ������ĳ����࣬�����ڽӿ�����ȫ��ȫ��ȫ��ȫ��ȫ�����
 * 	4���ӿ���û�й��췽�����ӿ��޷���ʵ����
 * 	5���ӿںͽӿ�֮����Զ�̳�
 * 	6��һ�������ʵ�ֶ���ӿڡ�
 * 	7��һ���ǳ�����ʵ�ֽӿڣ���Ҫ���ӿ��еķ�����ʵ��/��д/���ǡ�
 *  8���ӿ��еĳ����ͳ��󷽷����ǹ����ģ�Ҫ��public����
 *  9��public abstract����ʡ�� public static finalҲ����ʡ��
 *  10���̳к�ʵ��ͬʱ���ֵ�ʱ��̳���ǰʵ���ں�
 *  	eg:class A extends B implements C{}
 */

public class Test01 {
	public static void main(String[] args) {
		System.out.println(A.PI);
		System.out.println(A.SUCCESS);
		// ���³���˵��public static final����ʡ��
		// A.s=34455; ���ܶ���̬�ֶ� A.s��ֵ
		System.out.println(A.S);

	}
}

// ����һ���ӿ�
interface F {
}
interface A {
	// ����������public static final�����Ρ�
	public static final String SUCCESS = "succsee";
	public static final double PI = 3.1415;
	// public static final����ʡ��
	int S = 34;
	// ���󷽷� û�з����塾�ӿ��е����г��󷽷�����public abstract��
	public abstract void speak();
	// public abstract ����ʡ��
	void a();
}
// ���³���˵���ӿںͽӿ�֮����Զ�̳�
interface B {
	void m1();
}

interface C {
	void m2();
}

interface D {
	void m3();
}

interface E extends B, C, D {
	void m4();
}

// implements��ʵ�ֵ���˼����һ���ؼ���
// implements��extends����������

// ���³���˵��һ�������ʵ�ֶ���ӿ� ��ʵ�ֽӿ� ��Ҫ���з�������д
class M implements B, C {
	public void m1() {
	}

	public void m2() {
	}
}

class N implements E {
	public void m1() {
	}

	public void m2() {
	}

	public void m3() {
	}

	public void m4() {
	}
}

// ���³���˵��������ʵ�ֽӿڲ���Ҫ�����ĸ���
abstract class MM implements B, C {
}
