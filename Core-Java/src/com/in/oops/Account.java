package com.in.oops;

//encapsulation
public class Account {
	
	
	
	 private double balance ; 
	 
	 
	 public double getBalance() {
		 return balance ; 
		 
	 }
	 
	 public void setBalance(double balance) {
		 
		 this.balance = balance ; 
	 }
		 
		 
		 
		 public void deposit (int amount) {
		   System.out.println("Total balance " + getBalance());
		   System.out.println("Deposit Amount " + amount);
		   setBalance(getBalance()+ amount);
		   System.out.println("After Deposite Amount  " + getBalance()); 
		 }
		
		 public void withdrwal(int amount) {
			 if(getBalance()>amount) {
				 System.out.println("Total  balance" + getBalance());
				 System.out.println("withdrawl amount" + amount);
				 setBalance(getBalance() -amount);
			 }else {
				 System.out.println(" i dont have money");
			 }
			 
		 }
		 
		 public static void main(String[] args) {
			Account sc = new Account() ; 
			sc.setBalance(2000.34);
			sc.deposit(500);
			sc.withdrwal(3000);
		System.out.println( "total amount" +  sc.getBalance());	
		}
		 
	 }
	 


