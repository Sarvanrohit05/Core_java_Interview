package com.in.JavaBasics;

public class TestFunctionalWithLambda {
	
	public static void main(String[] args) {
		
 ///its not complemted 
		
		FuctionalInt f  =(a,b)->{
			return a*b ;
			
			
		}; 
	
		
		int a = 10 ; 
		int b=13; 
		
		f.add(a, b);
		FuctionalInt.sub(a, b);
		System.out.println(f.doStuff(a, b));
	}

}
