package com.zubs.JavaSE.Stringbuffer;
/*
 * StringBuilder��StringBuffer��������StringBuffer�ڶ��̻߳��������а�ȫ
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		s.append("ddd");
		s.append(true);
		s.append('��');
		System.out.println(s);
	}
}
