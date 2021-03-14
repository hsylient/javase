package com.zubs.JavaSE.Interface;

public class AAA {
	public static void main(String[] args) {
		People p=new People();
		p.speak();
		Teacher t=new Student();//父类型引用指向子类型对象 多态
		t.write();
		//t.sum(2,5);这个sum方法是子类型中特有的方法
		Teacher o=new Teacher();
		o.write();
		Student ssss=(Student)t;//强制类型转换
		int i = ssss.sum(1, 3);
		System.out.println(i);
	}
}

class People{
	public void speak() {
		System.out.println("people类的说方法");
	}
}

class Teacher{
	public void write() {
		System.out.println("Teacher类的写方法");
	}
}

class Student extends Teacher{
	public void write() {
		System.out.println("Student类继承Teacher的写方法");
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
}



