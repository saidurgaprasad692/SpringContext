package com.constructor.example;
import java.util.*;
public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Account a=accountDetails();
		System.out.println("Enter amount to deposit:");
		a.deposit(sc.nextInt());
		System.out.println("Enter amount to withdraw:");
		a.withdraw(sc.nextInt());
		sc.close();
	}
	public static Account accountDetails()
	{
		
		System.out.println("Enter Account Number:");
		int accNum=sc.nextInt();
		System.out.println("Enter balance amount:");
		int balance=sc.nextInt();
		System.out.println("Enter your name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter Phone number:");
		long phn=sc.nextLong();
		Account a1=new Account(accNum,balance,name,email,phn);
		return a1;
	}
}
