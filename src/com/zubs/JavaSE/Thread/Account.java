package com.zubs.JavaSE.Thread;
/*
 * ģ�������˻�
 */
public class Account {
	//�˺�
	private String acto;
	//���
	private double balance;
	//�޲ι���
	public Account() {
		super();
	}
	//���췽��
	public Account(String acto, double balance) {
		super();
		this.acto = acto;
		this.balance = balance;
	}
	//set��get����
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
	
	//ȡ���
	public void withdraw(double money) {
		//ȡ��֮ǰ�����
		double befor=this.getBalance();
		//ȡ��֮��
		double after=befor-money;
		//�������
		this.setBalance(after);
	}
}
























