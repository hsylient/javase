package com.zubs.JavaSE.Interface;

public class AAA {
	public static void main(String[] args) {
		People p=new People();
		p.speak();
		Teacher t=new Student();//����������ָ�������Ͷ��� ��̬
		t.write();
		//t.sum(2,5);���sum�����������������еķ���
		Teacher o=new Teacher();
		o.write();
		Student ssss=(Student)t;//ǿ������ת��
		int i = ssss.sum(1, 3);
		System.out.println(i);
	}
}

class People{
	public void speak() {
		System.out.println("people���˵����");
	}
}

class Teacher{
	public void write() {
		System.out.println("Teacher���д����");
	}
}

class Student extends Teacher{
	public void write() {
		System.out.println("Student��̳�Teacher��д����");
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
}



