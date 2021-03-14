package com.zubs.JavaSE.Thread;
/*
 * 模拟银行账户
 */
public class Account {
	//账号
	private String acto;
	//余额
	private double balance;
	//无参构造
	public Account() {
		super();
	}
	//构造方法
	public Account(String acto, double balance) {
		super();
		this.acto = acto;
		this.balance = balance;
	}
	//set和get方法
	public String getActo() {
		return acto;
	}
	public void setActo(String acto) {
		this.acto = acto;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//取款方法
	public void withdraw(double money) {
		//取款之前的余额
		double befor=this.getBalance();
		//取款之后
		double after=befor-money;
		//更新余额
		this.setBalance(after);
	}
}
























