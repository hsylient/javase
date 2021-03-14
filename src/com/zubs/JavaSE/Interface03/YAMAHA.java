package com.zubs.JavaSE.Interface03;

//雅马哈发动机
public class YAMAHA implements Engine{//雅马哈实现了engine的接口
	//接口中方法的重写
	public void start() {
		System.out.println("YAMAHA启动了！");
	}
}
