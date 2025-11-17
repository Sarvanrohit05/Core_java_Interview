package com.in.thread;

public class Racing  extends Thread{
	String name = null  ; 
	
	
	public static  Account acount = new  Account() ;
	
	public Racing(String name ) {
		this.name = name ; 
		
	}
	
	@Override
	public void run() {
   for(int i = 1 ; i<=5 ; i++) {
	   acount.deposit(name, 1000);
   }
		
	}
	

}
