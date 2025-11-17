package com.in.JavaBasics;

public class PrimeNo {
	
	
	public static void main(String[] args) {
		
		
		  for(int  i = 2 ; i<=100 ; i++) {
			  boolean temp = true ; 
			  
			  for(int j = 2 ; j<=i -1; j++) {
				  if(i%j==0) { 
				  temp = false  ;
			  }}
			  if(temp) {
			  System.out.println("primeno " + i);
		  }
	}
	}
}
