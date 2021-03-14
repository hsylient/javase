package com.zubs.JavaSE.Super;

public class Persion {
	int age;
	String name;
	
	//无参构造方法
	public Persion(){
		System.out.println("父类构造器");
	}
	
	public Persion(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	public void show() {
		System.out.println(name+":"+age);
	}
}





