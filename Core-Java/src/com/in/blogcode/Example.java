package com.in.blogcode;

public class Example {
	
		 public void display() {
			 System.out.println("Object created using newsStance() and Class.forname()");
		 }
		 
		 public static void main(String[] args) {
			
			   try {
				   Class<?> clazz = Class.forName("com.in.blogcode.Example");
				   
				    Example example =   (Example) clazz.getDeclaredConstructor().newInstance();
				    example.display();
			   }catch(Exception e ) {
				   e.printStackTrace();
			   }
			   
		}
	

}
