package com.in.String;

public class CountOccurenceOfString {
 //count the value char value 
	public static void main(String[] args) {
		//String se Int ko alg krna hai 
		String  name  = "rohit singh";
		
		 int count  = 0 ; 
		 
		 for(char a = 'a' ; a<= 'z'; a++) {
			 for(int i = 0  ; i<name.length() ; i++) {
				 if(a== name.charAt(i)) {
					 
					 count++ ; 
					 
				 }
				 
			 }
			 if(count!=0) {
				 System.out.println(a + " " + count);
				 count = 0 ;
				 
			 }
		 }}}

