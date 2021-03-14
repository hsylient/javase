package com.zubs.JavaSE.Interface02;

/*
 * 客户接口
 * 
 * 接口的作用：
 * 		1、可以使项目分层，所有层都面向接口开发，开发效率提高了；
 * 		2、接口使代码与代码之间的耦合度降低，就想灯泡与灯头的关系，变的可插拔，可以随意切换；
 * 			灯泡生产厂家和灯头生产厂家，都要遵循同一个原则就是螺口尺寸问题；
 * 		
 */
public interface CustomerService {
	// 定义一个退出系统的方法
	void logout();//等价于public abstract void logout();
}
