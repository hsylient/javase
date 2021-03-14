package com.zubs.JavaSE.Interface03;

//测试类
public class Test {
	public static void main(String[] args) {
		Engine e1=new YAMAHA();//父类型引用指向子类型对象  多态
		Car c=new Car(e1);
		c.testEngine();
		
		//换宏达
		c.e=new HONGDA();
		c.testEngine();
	}

}
