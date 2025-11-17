package com.in.String;

public class ReverseAtSamePlace {
	
	public static void main(String[] args) {
		String name = "rohit rajput" ; 
		        String [] a =   name.split(" ");
		        for(int i = 0 ; i<a.length ; i++) {
		        	
		        	for(int j = a[i].length()-1 ; j>= 0 ; j--) {
		        		System.out.print(a[i].charAt(j));
		        		
		        	}
		        	System.out.print(" ");
		        }
	}

}
