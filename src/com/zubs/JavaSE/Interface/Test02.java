package com.zubs.JavaSE.Interface;

/*
 * 1、类和类之间叫继承extends
 * 2、类和接口之间叫实现implements
 * 3、一个非抽象的类实现接口需要将接口中的所有方法重写
 */
public class Test02 {
	public static void main(String[] args) {
		//多态 父类型引用指向子类型对象
		Math02 m=new Math02Imp(); 
		System.out.println(m.sum(35, 65));
		Math02Imp ss =(Math02Imp)m;//强制类型转换
		System.out.println(ss.sub(1, 1));
		//编译的时候找的方法是你接口中的方法
		//在运行的时候找的方法是你底层对象的方法
	}

}

//定义一个接口
interface Math02{
	double PI=3.14;
	int sum(int a,int b);
//	int sub(int a,int b);
}


class Math02Imp implements Math02{
	//到这里直接编译会报错，因为抽象类类有重写
	
	//实现接口中的方法
	//int sum(int a,int b)	不能降低自 Math02 继承的方法的可视性
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
}





