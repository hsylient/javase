package com.zubs.JavaSE.Interface03;

//������
public class Test {
	public static void main(String[] args) {
		Engine e1=new YAMAHA();//����������ָ�������Ͷ���  ��̬
		Car c=new Car(e1);
		c.testEngine();
		
		//�����
		c.e=new HONGDA();
		c.testEngine();
	}

}
