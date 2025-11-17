package com.in.JavaBasics;

public class ConvertCode {
	
	  public static void main(String[] args) {
		//1 way
		// primitive  convert into   String
		  int i = 100 ;
		 String s1 =   String.valueOf(i);//its is used for convert primtive into String
		// System.out.println(s1);
		 
		 String s2 = "80";
		            
		    int s =   Integer.valueOf(s2); 
		   // System.out.println(s);
		    
		    
		    //2 way
		    
		      String s3 = "70";
		       int a =    Integer.parseInt(s3);//use String into primitve  
		      // System.out.println(a);
		       
		       int b = 60 ; 
		           String s4 =  Integer.toString(b);//convert into Oject String 
		         //  System.out.println(s4);
		           
		           //3way 
		           
		           String s5 = "50";
		            int r =     new Integer(s5);
		            System.out.println(r);
		            
		            int d = 30 ; 
		            
		             System.out.println(String.format("%d", d));
				 
	
	  }

}
