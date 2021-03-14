package com.zubs.JavaSE.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ����try..catch�е�finally�־�
 * 	1����finally�����еĴ���һ����ִ�У���ʹtry�����еĴ�������쳣
 * 	2��finally�־�����try...catchһ��ʹ��
 * 	3��ͨ����finally�����������Դ���ͷ�/�ر�
 * 
 */
public class Test10 {
	public static void main(String[] args) {
		//����λ�÷���try���� ������finally����в�����
		FileInputStream fip=null;
		
		/*
		try {
			//��������������
			FileInputStream fip=new FileInputStream("D:\\bjpowernode.sql");
			
			//һ������ֿ�ָ���쳣(����ʱ�쳣)
			String s=null;
			s.toString();
			
			//��ʹ������Ҫ�ر� ��Ϊ����ռ����Դ��
			fip.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointException e) {
			e.printStackTrace();
		}
		
		*/
		
		//���ϳ�������ָ���쳣֮�� ֱ�ӽ�ȥcatch������ �͵������رղ���
		
		try {
			//��������������
			fip=new FileInputStream("D:\\bjpowernode.sql");
			
			//һ������ֿ�ָ���쳣(����ʱ�쳣)
			String s=null;
			s.toString();
			
			//��ʹ������Ҫ�ر� ��Ϊ����ռ����Դ��
			//fip.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			//���Ĺرշ�������Ƚϱ���
			//finally�еĴ�����һ����ִ�е� ��ʹtry�г������쳣
		if (fip !=null) {	//�����ָ���쳣
			try {
				fip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		System.out.println("��ã�");
	}
}



















