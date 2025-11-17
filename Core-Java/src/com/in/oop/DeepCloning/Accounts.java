package com.in.oop.DeepCloning;

public class Accounts  implements Cloneable{
	
	
	public int balance ; 
	
	public Accounts(int balance ) {
		this.balance = balance ;
	}
	
	
	protected Object clone()  throws CloneNotSupportedException {
		return super.clone();
		
		
		
	}

}
