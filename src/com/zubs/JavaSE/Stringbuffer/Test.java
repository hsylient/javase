package com.zubs.JavaSE.Stringbuffer;
/*
 * 在java中如果进行字符串拼接建议使用
 * java.lang.StringBuffer
 * java.lang.StringBuilder
 * StringBuffer底层实际上是一个byte[]数组 初始化的容量是16;
 * 超过默认的16容量就会自动扩容
 * 优化:就是在之前预估计给定容量
 */
public class Test {
	public static void main(String[] args) {
		//创建数组
		StringBuffer stringbuffer=new StringBuffer();
		stringbuffer.append("jiao");
		stringbuffer.append("wo");
		stringbuffer.append("xiao");
		stringbuffer.append("huang");
		stringbuffer.append("jiao");
		stringbuffer.append("wo");
		stringbuffer.append("xiao");
		stringbuffer.append("huang");
		stringbuffer.append("jiao");
		stringbuffer.append("wo");
		stringbuffer.append("xiao");
		stringbuffer.append("huang");
		stringbuffer.append("jiao");
		stringbuffer.append("wo");
		stringbuffer.append("xiao");
		stringbuffer.append("huang");
		stringbuffer.append("jiao");
		stringbuffer.append("wo");
		stringbuffer.append("xiao");
		stringbuffer.append("huang");
		stringbuffer.append(true);
		System.out.println(stringbuffer.toString());//jiaowoxiaohuangtrue
		
		
		//指定初始化容量
		StringBuffer ss=new StringBuffer(1);
		ss.append("huang");
		ss.append("ya");
		System.out.println(ss.toString());
		
		
	}
}










