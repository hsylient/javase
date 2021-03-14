package com.zubs.JavaSE.Interface02;

/*
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		//要执行CustomerServiceImpl中的logout方法
		//以下程序面向接口去调用
		CustomerService cs=new CustomerServiceImpl();//多态
		
		//调用
		cs.logout();
	}

}
