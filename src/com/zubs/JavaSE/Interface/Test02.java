package com.zubs.JavaSE.Interface;

/*
 * 1�������֮��м̳�extends
 * 2����ͽӿ�֮���ʵ��implements
 * 3��һ���ǳ������ʵ�ֽӿ���Ҫ���ӿ��е����з�����д
 */
public class Test02 {
	public static void main(String[] args) {
		//��̬ ����������ָ�������Ͷ���
		Math02 m=new Math02Imp(); 
		System.out.println(m.sum(35, 65));
		Math02Imp ss =(Math02Imp)m;//ǿ������ת��
		System.out.println(ss.sub(1, 1));
		//�����ʱ���ҵķ�������ӿ��еķ���
		//�����е�ʱ���ҵķ�������ײ����ķ���
	}

}

//����һ���ӿ�
interface Math02{
	double PI=3.14;
	int sum(int a,int b);
//	int sub(int a,int b);
}


class Math02Imp implements Math02{
	//������ֱ�ӱ���ᱨ����Ϊ������������д
	
	//ʵ�ֽӿ��еķ���
	//int sum(int a,int b)	���ܽ����� Math02 �̳еķ����Ŀ�����
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
}





