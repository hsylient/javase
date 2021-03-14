package com.zubs.JavaSE.Abstract;

/*
 * 抽象类的定义：
 * 	类和类之间具有共同特征 这些共同特征通过再一次抽象形成抽象类
 * 	对于类本身来说已经不存在了 所以不能创建对象
 * 抽象类和抽象类之间实际上还有共同的特征，还可以进一步的的抽象；
 * 类到对象叫实例化，对象到类叫抽象
 */

/*
 * 1、如何定义一个抽象类
 *		class关键字前加一个abstract
 * 2、抽象类无法被实例化，那么抽象类的作用就是被子类去继承的
 * 3、虽然抽象类没办法实例化，但是抽象类也有构造方法，该构造方法是给子类创建对象用的
 * 4、抽象类中可以定义抽象方法
 * 		在方法修饰符列表中加abstract关键字，且抽象方法以“;”结束，不能带有方法体
 * 		eg:public abstract m1();	定义名为m1方法的抽象方法
 * 5、抽象类中不一定有抽象方法，但是抽象方法一定在抽象类中
 * 6、一个非抽象类继承抽象类必须进行方法的实现、重写、覆盖
 * 7、抽象类也是引用数据类型
 * 8、final和abstract不能连用 因为abstract就是用来继承的，而final是最终的
 */
public class Test {
	public static void main(String[] args) {
	//Account a=new Account(); 抽象类无法被实例化
	}
}

abstract class Account{
	public Account() {}
}

//子类去继承抽象类，子类可以被实例化
class CreditAccount extends Account{
	
}
//抽象类的子类依然可以是抽象类
abstract class CreditAccount02 extends Account{
	
}
//抽象动物类
abstract class Animal{
	public abstract void move();
}

//以下代码编译报错:类型 Bird 必须实现继承的抽象方法 Animal.move（）
//class dog extends Animal{}

//也就是说 在非抽象类中不能有抽象方法，以下程序中bird类实现了animal的move方法
class Bird extends Animal{
	public void move() {
	}
}






















