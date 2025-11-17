package com.in.Exception;

public class NullPointer {
	
	   public static void main(String[] args) {
	       String s = null ; 
	       try {
		     System.out.println(s.length());
		   
	       }catch(NullPointerException  e) {
	         System.out.println(e);
	   
	     }
	  }

}
