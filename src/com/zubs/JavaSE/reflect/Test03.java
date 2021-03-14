package com.zubs.JavaSE.reflect;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * ͨ��IO����ȡ�ļ���
 */
public class Test03 {
	public static void main(String[] args) {
		FileReader read = null;
		try {
			read = new FileReader("src/com/zubs/JavaSE/reflect/classinfo.properties");
			//�������������
			Properties pro = new Properties();
			//���ص�Map������
			pro.load(read);
			String s = pro.getProperty("className");
			Class c = Class.forName(s);
			Object obj = c.newInstance();
			System.out.println(obj);
		} catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			if (read != null) {
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}









































