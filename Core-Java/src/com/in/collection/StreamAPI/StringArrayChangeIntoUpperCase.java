package com.in.collection.StreamAPI;

import java.util.Arrays;

public class StringArrayChangeIntoUpperCase {
	
	public static void main(String[] args) {
		
		String [] str = {"rohit" , "sarvan" , "rajput"};
		
		
		  String [] uppercase= Arrays.stream(str).map(e ->
		  e.toUpperCase()).toArray(String[]:: new);//with lambda expression
		  
		  Arrays.stream(uppercase).forEach(System.out::println);
		      	
		
		
		/*
		 * String[] uppercase1 =
		 * Arrays.stream(str).map(String::toUpperCase).toArray(String[]::new);//rwith
		 * reffrence method
		 * 
		 * 
		 * Arrays.stream(uppercase1).forEach(System.out::println);
		 */
		            }
		
	}


