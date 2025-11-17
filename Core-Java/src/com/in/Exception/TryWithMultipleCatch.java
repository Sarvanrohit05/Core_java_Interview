package com.in.Exception;

public class TryWithMultipleCatch {
	
	
	
	public static void main(String[] args) {
		
		int  A = 10;
		int  b=2;
		String s = null ;
		
		
		try { 

			System.out.println(A/2);
		//	System.out.println(A/0);
		System.out.println(s.length());
			
		}catch(ArithmeticException e){
			System.out.println(e ); 
			System.exit(0);
		}catch(NullPointerException e) {
			System.out.println(e);
			//System.exit(0); 
			//if you perform arthematic exception but finally block shouldn't work so in catch  block you can use System.exit same as upper method
		}finally {
			System.out.println("doonee ");
		}
		
	}

}
