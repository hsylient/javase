package com.zubs.JavaSE.Interface;
/*
 * 1、接口和接口之间是多继承
 * 2、类和类之间是单继承 
 * 3、接口的多继承弥补了类与类单继承的缺陷
 */
public class Test03 {
	public static void main(String[] args) {
		//多态 父类型引用指向子类型对象
		Aa a=new Dd();
		Bb b=new Dd();
		Cc c=new Dd();
		
		a.m1();
//		a.m2 这个编译报错 
//		如果想让a去调m2方法需要向下转型
		Bb b2=(Bb)a;
		b2.m2();
	}

}

interface Aa{
	void m1();
}
interface Bb{
	void m2();
}
interface Cc{
	void m3();
}
//类的多接口实现   就类似于多继承
class Dd implements Aa,Bb,Cc{
	//每一个接口中的方法都要重写
	public void m1() {
		System.out.println("我是Dd类中的m1方法");
	}
	public void m2() {
		System.out.println("我是Dd类中的m2方法");
	}
	public void m3() {
		System.out.println("我是Dd类中的m3方法");
	}
}


