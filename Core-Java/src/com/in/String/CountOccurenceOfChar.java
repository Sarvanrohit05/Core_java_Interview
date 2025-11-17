package com.in.String;

public class CountOccurenceOfChar {
	
	  public static void main(String[] args) {
		String str = "rohitr";
		int count = 0 ; 
		for(int i = 0 ; i<str.length() ; i++) {
			         char ch =     str.charAt(i);
			         String s =  String.valueOf(ch);
			         
			         if(s.matches("r")) {
			        	 count++ ; 
			         }
		}
		System.out.println( count);
		 
	}

}
