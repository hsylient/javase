package com.zubs.JavaSE.Interface03;

//������
public class Car {
	//����ӿڱ��
	Engine e;
	
	//���췽�������������������
	Car(Engine e){
		this.e=e;	//��������Ľӿھ������engine�µ�e
	}
	
	//����Ӧ���ܹ���������
	public void testEngine(){
		e.start();
	}
}
