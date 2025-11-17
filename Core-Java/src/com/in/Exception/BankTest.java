package com.in.Exception;

public class BankTest {
	public static void main(String[] args) {
		 
		BankAccount a = new BankAccount();
		a.setBalance(2000);
		a.deposit(100);
		//a.setBalance(200);  
	//	a.deposit(20000);/* if i try setbalance after deposti i will be reset and new will be come */
		//System.out.println(a.getBalance());
	try {
		a.withdraw(500);
	//	a.withdraw(100);
		//a.setBalance(400);
		System.out.println(a.getBalance());
	} catch (BankException e) {
		System.out.println("Amount is less than 2000");
		System.out.println(e);
	}
	}

}
