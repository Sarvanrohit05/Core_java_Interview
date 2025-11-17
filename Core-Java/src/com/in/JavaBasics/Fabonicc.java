package com.in.JavaBasics;

public class Fabonicc {
	
	  public static void main(String[] args) {
	  int a = 0 ; 
	  int b= 1 ; 
	  
	  int temp =0 ;
	  
	  for(int i = 1 ; i<=10 ; i++) {
	 temp = 	  a+b; 
	    a=b ; 
	    
	    b=   temp ; 
	    System.out.println(temp );
	    
	  }
	  
	  
	  }

}
