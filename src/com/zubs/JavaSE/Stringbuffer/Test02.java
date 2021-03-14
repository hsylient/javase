package com.zubs.JavaSE.Stringbuffer;
/*
 * StringBuilder与StringBuffer的区别是StringBuffer在多线程环境下运行安全
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		s.append("ddd");
		s.append(true);
		s.append('中');
		System.out.println(s);
	}
}
