package com.in.JavaBasics;

@FunctionalInterface
public interface FuctionalInt {
	
	int doStuff(int a , int b);
	
	public static void sub (int a , int b) {
		System.out.println("substraction " + (a-b));
	}
	
	 public  default void add (int a , int b ) {
		 System.out.println("additon is "+ (a+b));
	 }
	 

}
