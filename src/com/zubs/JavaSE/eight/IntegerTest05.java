package com.zubs.JavaSE.eight;
/*
 * ����String����int
 */
public class IntegerTest05 {
	public static void main(String[] args) {
		//static int parseInt(String s)  
		//��̬���� ����String����int
		int a=Integer.parseInt("423");
		System.out.println(a);
		
		//java.lang.NumberFormatException
//		System.out.println(Integer.parseInt("С��"));
		
		double s=Double.parseDouble("3.14");
		System.out.println(s+1);
		
		float f=Float.parseFloat("1.0");
		System.out.println(f+1);
		
		//��ʮ����ת��Ϊ������
		//static String toBinaryString(int i)  
		String ss=Integer.toBinaryString(3);
		System.out.println("3ת��Ϊ�����ƵĽ��Ϊ"+ss);
		
	}
}








