package com.sopra.project;
import java.util.Scanner;
public class Transactions {
	private static int deposit(int a,int total) {
		return total+a;
	}
	private static int withdraw(int b,int total1) {
		return total1-b;
	}
	private static int display(int balance) {
		return balance;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter account number");
		long i = sc.nextLong();
		while(true) {
			System.out.println("choose 1 for deposit");
			System.out.println("choose 2 for withdraw");
			System.out.println("choose 3 to display");
			int n = sc.nextInt();
			int amount = sc.nextInt();
			if(n==1) {
				System.out.println("enter amount");
				System.out.println(deposit(amount,1000));
			}
			if(n==2) {
				System.out.println("enter amount");
				System.out.println(withdraw(amount,1000));
			}
			if(n==3) {
				System.out.println(display(amount));
			}
		}
	}
}
