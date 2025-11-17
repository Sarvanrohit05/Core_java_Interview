package com.in.String;

public class Vowels {
	
	
	  public static void main(String[] args) {
		  String name = "google";
		  
		  int count = 0 ;
		  
		  for(int i = 0 ; i<name.length(); i++) {
		  
		             char c =  name.charAt(i);
		             
		             if(c=='a'||c=='i'|| c=='o'|| c=='u'|| c=='e' || c=='A') {
		            	 count++ ; 
		      
		             }
		 }
		  
		  System.out.println(count);
		  
		  }
	}


