package com.zubs.JavaSE.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 深入 try...catch
 * 1、catch后面的小括号里边可以是具体的类型，也可以是其父类
 * 2、catch可以写多个，建议一个一个写，便于后期程序的调试
 * 3、catch写多个的时候，从上到下必须遵循从小到大的原则
 * 4、如果想让调用者知道，选择上抛，其余的选着try...catch
 */
public class Test07 {
	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("D:\\bjpowernode.sql");
			fis.read();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
		} catch(IOException e2) {
			System.out.println("读文件报错了！");
		} 
		
		//catch写多个的时候，从上到下必须遵循从小到大的原则
		/*
		try {
			FileInputStream fis =new FileInputStream("D:\\bjpowernode.sql");
			fis.read();
		} catch (IOException e) {
			System.out.println("文件不存在！");
		} catch(FileNotFoundException e2) {
			System.out.println("读文件报错了！");
		} 
		*/
	}
}

