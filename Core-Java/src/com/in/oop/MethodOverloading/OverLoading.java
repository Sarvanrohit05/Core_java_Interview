package com.in.oop.MethodOverloading;

public class OverLoading {
	
	
	public int add( int a  , int  b ) {
		return a+b ; 
	}
	
	
	public int add(int a , int b , int c) {
		return a+b+c ; 
	}

	
	public static void main(String[] args) {
		
		OverLoading sc = new OverLoading() ;
		
		System.out.println(sc.add(21, 34));
		System.out.println(sc.add(34, 23, 4));
	}
}
