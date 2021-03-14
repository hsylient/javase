package com.zubs.JavaSE.Interface;

/*
 * 接口也是一种引用数据类型，可以等同看做类  接口在编译之后也生成class文件
 * 	1、如何定义接口
 * 		【修饰符】interface 接口名{}
 * 	2、接口中只能只能只能只能只能包含两部分内容
 * 		常量		public static final PI=3.14;
 * 		抽象方法	public abstract 类名();
 * 	3、接口是一个特殊的抽象类，特殊在接口是完全完全完全完全完全抽象的
 * 	4、接口中没有构造方法，接口无法被实例化
 * 	5、接口和接口之间可以多继承
 * 	6、一个类可以实现多个接口。
 * 	7、一个非抽象类实现接口，需要将接口中的方法“实现/重写/覆盖”
 *  8、接口中的常量和抽象方法都是公开的，要用public修饰
 *  9、public abstract可以省略 public static final也可以省略
 *  10、继承和实现同时出现的时候继承在前实现在后
 *  	eg:class A extends B implements C{}
 */

public class Test01 {
	public static void main(String[] args) {
		System.out.println(A.PI);
		System.out.println(A.SUCCESS);
		// 以下程序说明public static final可以省略
		// A.s=34455; 不能对终态字段 A.s赋值
		System.out.println(A.S);

	}
}

// 定义一个接口
interface F {
}
interface A {
	// 常量必须用public static final【修饰】
	public static final String SUCCESS = "succsee";
	public static final double PI = 3.1415;
	// public static final可以省略
	int S = 34;
	// 抽象方法 没有方法体【接口中的所有抽象方法都是public abstract】
	public abstract void speak();
	// public abstract 可以省略
	void a();
}
// 以下程序说明接口和接口之间可以多继承
interface B {
	void m1();
}

interface C {
	void m2();
}

interface D {
	void m3();
}

interface E extends B, C, D {
	void m4();
}

// implements是实现的意思，是一个关键字
// implements和extends的意义相似

// 以下程序说明一个类可以实现多个接口 类实现接口 需要进行方法的重写
class M implements B, C {
	public void m1() {
	}

	public void m2() {
	}
}

class N implements E {
	public void m1() {
	}

	public void m2() {
	}

	public void m3() {
	}

	public void m4() {
	}
}

// 以下程序说明抽象类实现接口不需要方法的覆盖
abstract class MM implements B, C {
}
