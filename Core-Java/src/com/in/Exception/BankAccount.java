package com.in.Exception;

public class BankAccount {
	
	
	public double balance ;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	
	public void deposit(double amt) {
		balance+= amt ;  
		System.out.println("your amount is debited successfully" + amt );
		System.out.println(getBalance());
	}
	
	
	 public double withdraw(double amt) throws BankException {
		 if (balance < 2000)
	    {
          BankException e = new BankException("Amount is less than 2000.....");
  
          throw e; }
		 
	      else { 
	    	  balance = balance - amt; 
	    	  } 
		 
		  return balance; 
		  
	  }
	
      }
