package com.mathOps.example;

import java.util.Scanner;

public class DollarToRupee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dollars in USD:");
		double usd=sc.nextDouble(),inr;
		inr=usd*77.69;
		System.out.printf("%.2f$ USD in INR is %.2fRs",usd,inr);
		sc.close();
	}

}
