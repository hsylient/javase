package com.zubs.JavaSE.Super;

/*
 * 	super������
 * 		1��super�ؼ�����this�ؼ��ֶ��������
 * 		2��super�ؼ���ֻ���ڴ��ڼ̳й�ϵ�������г��֣����������
 * 		3��super�ؼ��ֳ��������๹�����б�ʾ���ø��๹����
 * 		4��super�ؼ�����������Ĭ�������ص�
 * 		5��super�ؼ��ֳ��������෽���б�ʾ���ʸ��෽����������
 * 		6�����������ܱ��̳У����ǿ���ͨ��superȥ���ø���Ĺ��췽��
 * 		7����ʾ���ø��๹���� ��Ĭ������� ���๹������java���ڹ������Ŀ�ͷ����һ��super();
 */
public class Test {
	public static void main(String[] args) {
		Persion p=new Persion("С��",23);
		p.show();
		System.out.println("------------------------------");
		
		Teacher t=new Teacher("����ʦ",43,20000);
		t.show();
		t.showSalary();
		System.out.println("------------------------------");
		
		Student s=new Student(24,"С��",150);
		s.show();
		s.showScore();
	}

}





















