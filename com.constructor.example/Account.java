package com.constructor.example;

public class Account {
	private int accNumber,balance;
	private String name,email;
	private long phn;
	public Account(int accNumber, int balance, String name, String email, long phn) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phn = phn;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	public void deposit(int amnt)
	{
		this.setBalance(this.balance+amnt);
		System.out.println("Balance amount after deposit: "+this.getBalance());
	}
	public void withdraw(int amnt)
	{
		if(amnt>this.balance){
			System.out.println("Sorry!!! No enough balance");
		}
		else {
			this.setBalance(this.balance-amnt);
			System.out.println("Balance amount after withdraw: "+this.getBalance());
		}
	}
}
