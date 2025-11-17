package com.in.JavaBasics;

public class IndexOFNUmberInArray {
	
	public static void main(String[] args) {
		  int []arr = {1,8,3,0};
		    int num =8 ; 
		    int temp = 0 ; 
		    
		    for(int i = 0 ; i<arr.length ; i++) {
		    	if(num==arr[i]) {
		    		temp = i;
		    	}
		    }
		    System.out.println("INdeox of "  + num + "is " + temp );
		    
	}

}
