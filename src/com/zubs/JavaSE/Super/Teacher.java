package com.zubs.JavaSE.Super;

public class Teacher extends Persion{
//	String name;
//	int age;
	double salary;//����
	
	public Teacher() {
	}
	
	public Teacher(String name,int age,double salary) {
//		super();
//		this.age =age;
//		this.name=name;
//		this.salary=salary;
		super(name,age);
		this.salary=salary;
	}
//	public void show() {
//		System.out.println(name+":"+age);
//	}
	
	public void showSalary() {
		System.out.println("����"+":"+salary);
	}
}





