package com.in.JavaBasics;

public class TestFunctionalInterface implements  FuctionalInt {  

	@Override
	public int doStuff(int a, int b) {
		
		return a*b;
	
	
	}
	
	public static void main(String[] args) {
		 TestFunctionalInterface fc = new TestFunctionalInterface() ; 
		 
		 int a = 4 ; 
		 int b = 5 ; 
		 fc.add(a, b);
		 
		 FuctionalInt.sub(a, b);
		 System.out.println(fc.doStuff(a, b));
	
	}
	
	}
