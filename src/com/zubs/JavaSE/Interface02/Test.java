package com.zubs.JavaSE.Interface02;

/*
 * ������
 */
public class Test {
	public static void main(String[] args) {
		//Ҫִ��CustomerServiceImpl�е�logout����
		//���³�������ӿ�ȥ����
		CustomerService cs=new CustomerServiceImpl();//��̬
		
		//����
		cs.logout();
	}

}
