package com.zubs.JavaSE.Interface02;

/*
 * 编写接口的实现类
 * 该类的实现完全是面向接口的
 */
public class CustomerServiceImpl implements CustomerService {
	// 对接口中的方法进行实现
	public void logout() {
		System.out.println("成功退出！");
	}
}
