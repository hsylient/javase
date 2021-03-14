package com.zubs.JavaSE.polymorphic;

//≤‚ ‘¿‡
public class Test {
	public static void main(String[] args) {
		Cat tom=new Cat();
		Dog gou=new Dog();
		Snack mangse=new Snack();
		Master zhangsan=new Master();
		
		
		zhangsan.feed(tom);
		zhangsan.feed(gou);
		zhangsan.feed(mangse);
	}
}