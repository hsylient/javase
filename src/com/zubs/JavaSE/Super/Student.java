package com.zubs.JavaSE.Super;

public class Student extends Persion{
//	int age;
//	String name;
	double score;
	
	public Student() {
	}
	
	public Student(int age,String name,double score) {
		this.age=age;
		this.name=name;
		this.score=score;
	}
	
//	public void show() {
//		System.out.println(name+":"+age);
//	}
	
	public void showScore() {
		super.show();
		System.out.println("³É¼¨"+":"+score);
	}
}











