package com.zubs.JavaSE.Super;

/*
 * 	super：超级
 * 		1、super关键字与this关键字都代表对象
 * 		2、super关键字只能在存在继承关系的子类中出现，代表父类对象
 * 		3、super关键字出现在子类构造器中表示调用父类构造器
 * 		4、super关键字在子类中默认是隐藏的
 * 		5、super关键字出现在子类方法中表示访问父类方法或者属性
 * 		6、构造器不能被继承，但是可以通过super去调用父类的构造方法
 * 		7、表示引用父类构造器 在默认情况下 子类构造器中java会在构造器的开头隐藏一个super();
 */
public class Test {
	public static void main(String[] args) {
		Persion p=new Persion("小黄",23);
		p.show();
		System.out.println("------------------------------");
		
		Teacher t=new Teacher("刘老师",43,20000);
		t.show();
		t.showSalary();
		System.out.println("------------------------------");
		
		Student s=new Student(24,"小赵",150);
		s.show();
		s.showScore();
	}

}





















