package com.zubs.JavaSE.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ���� try...catch
 * 1��catch�����С������߿����Ǿ�������ͣ�Ҳ�������丸��
 * 2��catch����д���������һ��һ��д�����ں��ڳ���ĵ���
 * 3��catchд�����ʱ�򣬴��ϵ��±�����ѭ��С�����ԭ��
 * 4��������õ�����֪����ѡ�����ף������ѡ��try...catch
 */
public class Test07 {
	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("D:\\bjpowernode.sql");
			fis.read();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ������ڣ�");
		} catch(IOException e2) {
			System.out.println("���ļ������ˣ�");
		} 
		
		//catchд�����ʱ�򣬴��ϵ��±�����ѭ��С�����ԭ��
		/*
		try {
			FileInputStream fis =new FileInputStream("D:\\bjpowernode.sql");
			fis.read();
		} catch (IOException e) {
			System.out.println("�ļ������ڣ�");
		} catch(FileNotFoundException e2) {
			System.out.println("���ļ������ˣ�");
		} 
		*/
	}
}

