package com.zubs.JavaSE.eight;
/*
 * 1�����л����������͵İ�װ��
 * 	������������			  ��װ����
 * 	  byte			  java.lang.Byte(����Number)
 * 	  short			  java.lang.Short(����Number)
 * 	  int			  java.lang.Integer(����Number)
 * 	  long			  java.lang.Long(����Number)
 * 	  float			  java.lang.Float(����Number)
 * 	  double		  java.lang.Double(����Number)
 * 	  boolean		  java.lang.Boolean(����Object)
 * 	  char			  java.lang.Character(����Object) 	
 * 2����Ҫ����Integer
 * 3�����ְ�װ���������������ǰ�װ�࣬���ǵĸ��඼��Number
 * 4��Number��һ�������࣬�޷�ʵ����
 * 5��������������ת��Ϊ�����������ͽ���װ��
 * 6��������������ת��Ϊ�����������ͽв���
 */

public class IntegetTest {
	public static void main(String[] args) {
		//23�Ǹ������������� ���й��췽���İ�װ �ﵽ�˻������������������������ͽ���ת��
		//������������ת��Ϊ������������
		Integer in=new Integer(23);
		
		//��������������ת��Ϊ������������
		float f=in.floatValue();
		System.out.println(f);//23.0
		
		int ii=in.intValue();
		System.out.println(ii);
	}
}








