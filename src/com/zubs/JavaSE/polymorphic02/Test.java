package com.zubs.JavaSE.polymorphic02;

public class Test {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.move();
		
		Cat c = new Cat();
		c.move();
		c.catchMouse();
		
		Bird b = new Bird();
		b.move();
		
//		需要记住的是无论是向上类型转换 还是向下类型转换 两个类型之间必须有继承关系
		
		/*
		 * 向上类型转换(upcasting)
		 * 子类型→父类型
		 * 父类型引用指向子类型对象
		 * 又被称为自动类型转换
		 */
		System.out.println("----------------------");
		Animal a2 = new Cat();
		a2.move();
		
		/**
		 * 向下类型转换(downcasting)
		 * 父类型→子类型
		 * 又被称为强子类型转换
		 * 什么时候需要向下类型转换呢？
		 * 父类型中的对象 需要访问子类型中特有的方法
		 */
		Cat c2 = (Cat) a2;
		c2.catchMouse();
		
		
		
		
		
		
		
//		父类型的引用指向子类型【多态】
		Animal a3=new Bird();
		Bird bbb=(Bird)a3;
		bbb.fly();
		/**
		 * 1、以下程序编译是没有问题的，因为编译器检查到a3的数据类型是Animal
		 * Animal和Cat之间存在继承关系，并且Animal是父类，Cat是子类
		 * 父类型转换成子类型叫做向下转型，需要强制类型转换
		 * 语法正确
		 * 
		 * 2、程序虽然通过了编译 但是在运行阶段出现错误 
		 * 因为在JVM的堆内存中真实存在一个Bird类型的对象
		 * Bird类型的对象无法转换成Cat类型的对象
		 * 因为两种类型之间不存在继承关系此时出现了著名的异常
		 * java.lang.ClassCastException
		 * 类型转换异常 通常发生在向下转型的时候【强制类型转换】
		 */
//		Cat c3=(Cat)a3;
		/**
		 * 如何解决类型转换异常？
		 * 	使用instanceof运算符可以避免出现以上的异常
		 * 语法格式：
		 * 引用 instanceof 数据类型名
		 * 以上运算符执行结果是boolean类型 true false
		 * 如果运算的结果是真：a这个引用指向的对象是一个Animal类型
		 * 如果运算的结果为假：a这个引用指向的对象是不一个Animal类型
		 */
		
		/**
		 * 当a3引用指向的对象确实是一个Cat类型时{
			Cat c3=(Cat)a3;
			}
		*/
		if(a3 instanceof Cat) {//如果你是一个猫的类型那么我就转换成猫的类型(a3是一个Cat类型的对象吗？)
			Cat c3=(Cat)a3;
			c3.catchMouse();
		}
		else if(a3 instanceof Bird) {//如果你是一个鸟的类型那么我就转换成鸟的类型
			Bird b2=(Bird)a3;
			b2.fly();
		}
	}
}