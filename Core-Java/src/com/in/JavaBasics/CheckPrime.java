package com.in.JavaBasics;

public class CheckPrime {
	
	public static void main(String[] args) {

       int  num = 24 ; 
      boolean flag= false; 
       for(int i = 2 ; i<num  ; i++) {
    	   if(num%i==0) {
    		   flag = true ;
    	   }
       }
       if(flag ) {
    	   System.out.println("this is prime no ");
       }else {
    	   System.out.println("this is not prime no ");
       }
		
		
	}

}
