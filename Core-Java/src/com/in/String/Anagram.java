package com.in.String;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "vaja";
		String s2 = "java" ; 
		
		char [] arr1  =   s1.toCharArray(); 
		char [] arr2 = s2.toCharArray();
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("this is anagram ");
		}else {
			System.out.println("this is not anagram ");
		}
	}

}
