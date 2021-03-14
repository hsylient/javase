package com.zubs.JavaSE.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 关于try..catch中的finally字句
 * 	1、在finally语句块中的代码一定会执行，即使try语句块中的代码出现异常
 * 	2、finally字句必须和try...catch一起使用
 * 	3、通常在finally语句块中完成资源的释放/关闭
 * 
 */
public class Test10 {
	public static void main(String[] args) {
		//声明位置放在try外面 这样在finally语句中才能用
		FileInputStream fip=null;
		
		/*
		try {
			//创建输入流对象
			FileInputStream fip=new FileInputStream("D:\\bjpowernode.sql");
			
			//一定会出现空指针异常(运行时异常)
			String s=null;
			s.toString();
			
			//流使用完了要关闭 因为流是占用资源的
			fip.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointException e) {
			e.printStackTrace();
		}
		
		*/
		
		//以上程序发生空指针异常之后 直接进去catch语句块中 就导致流关闭不了
		
		try {
			//创建输入流对象
			fip=new FileInputStream("D:\\bjpowernode.sql");
			
			//一定会出现空指针异常(运行时异常)
			String s=null;
			s.toString();
			
			//流使用完了要关闭 因为流是占用资源的
			//fip.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			//流的关闭放在这里比较保险
			//finally中的代码是一定会执行的 即使try中出现了异常
		if (fip !=null) {	//避免空指针异常
			try {
				fip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		System.out.println("你好！");
	}
}



















