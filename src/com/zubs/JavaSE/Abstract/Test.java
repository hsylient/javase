package com.zubs.JavaSE.Abstract;

/*
 * ������Ķ��壺
 * 	�����֮����й�ͬ���� ��Щ��ͬ����ͨ����һ�γ����γɳ�����
 * 	�����౾����˵�Ѿ��������� ���Բ��ܴ�������
 * ������ͳ�����֮��ʵ���ϻ��й�ͬ�������������Խ�һ���ĵĳ���
 * �ൽ�����ʵ������������г���
 */

/*
 * 1����ζ���һ��������
 *		class�ؼ���ǰ��һ��abstract
 * 2���������޷���ʵ��������ô����������þ��Ǳ�����ȥ�̳е�
 * 3����Ȼ������û�취ʵ���������ǳ�����Ҳ�й��췽�����ù��췽���Ǹ����ഴ�������õ�
 * 4���������п��Զ�����󷽷�
 * 		�ڷ������η��б��м�abstract�ؼ��֣��ҳ��󷽷��ԡ�;�����������ܴ��з�����
 * 		eg:public abstract m1();	������Ϊm1�����ĳ��󷽷�
 * 5���������в�һ���г��󷽷������ǳ��󷽷�һ���ڳ�������
 * 6��һ���ǳ�����̳г����������з�����ʵ�֡���д������
 * 7��������Ҳ��������������
 * 8��final��abstract�������� ��Ϊabstract���������̳еģ���final�����յ�
 */
public class Test {
	public static void main(String[] args) {
	//Account a=new Account(); �������޷���ʵ����
	}
}

abstract class Account{
	public Account() {}
}

//����ȥ�̳г����࣬������Ա�ʵ����
class CreditAccount extends Account{
	
}
//�������������Ȼ�����ǳ�����
abstract class CreditAccount02 extends Account{
	
}
//��������
abstract class Animal{
	public abstract void move();
}

//���´�����뱨��:���� Bird ����ʵ�ּ̳еĳ��󷽷� Animal.move����
//class dog extends Animal{}

//Ҳ����˵ �ڷǳ������в����г��󷽷������³�����bird��ʵ����animal��move����
class Bird extends Animal{
	public void move() {
	}
}






















