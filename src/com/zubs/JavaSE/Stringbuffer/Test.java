package com.zubs.JavaSE.Stringbuffer;
/*
 * ��java����������ַ���ƴ�ӽ���ʹ��
 * java.lang.StringBuffer
 * java.lang.StringBuilder
 * StringBuffer�ײ�ʵ������һ��byte[]���� ��ʼ����������16;
 * ����Ĭ�ϵ�16�����ͻ��Զ�����
 * �Ż�:������֮ǰԤ���Ƹ�������
 */
public class Test {
	public static void main(String[] args) {
		//��������
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
		
		
		//ָ����ʼ������
		StringBuffer ss=new StringBuffer(1);
		ss.append("huang");
		ss.append("ya");
		System.out.println(ss.toString());
		
		
	}
}










