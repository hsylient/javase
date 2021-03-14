package com.zubs.JavaSE.Interface03;

//宏达发动机
public class HONGDA implements Engine{//宏达实现了engine的接口
	//接口中方法的重写
	public void start() {
		System.out.println("HONGDA启动了！");
	}
}