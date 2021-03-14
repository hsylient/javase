package com.zubs.JavaSE.Interface03;

//汽车类
public class Car {
	//面向接口编程
	Engine e;
	
	//构造方法用来创建汽车对象的
	Car(Engine e){
		this.e=e;	//这个汽车的接口就是这个engine下的e
	}
	
	//汽车应该能够测试引擎
	public void testEngine(){
		e.start();
	}
}
