package com.in.Exception;

public class StringOutOfBoundExce extends Exception {
	
	public static void main(String[] args) {
		

	String s = "rohit";
	
	
	try {
		System.out.println((s.charAt(5)));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println("StringOutOFbondException");
		
		
		
	}

}}
