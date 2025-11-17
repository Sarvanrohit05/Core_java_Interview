package com.in.Exception;

public class StringOutOfBondIndex {
	
	
	
	       public static void main(String[] args) {
			String s = "rohit";
			try {
                    System.out.println(s.charAt(s.lastIndexOf(8)));
		  
			}catch(StringIndexOutOfBoundsException e ) {
			    
		             System.out.println(e);
		}
		}

}
