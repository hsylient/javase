package com.zubs.JavaSE.Super;

public class Persion {
	int age;
	String name;
	
	//�޲ι��췽��
	public Persion(){
		System.out.println("���๹����");
	}
	
	public Persion(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	public void show() {
		System.out.println(name+":"+age);
	}
}





