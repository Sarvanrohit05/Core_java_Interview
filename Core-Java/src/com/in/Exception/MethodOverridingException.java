package com.in.Exception;

class Parent {

	void msg() {
		System.out.println("parent method");
	}
}

public class MethodOverridingException extends Parent {
          
	    // overriding the method in child class
		// gives compile time error
		// Because if we throw an exception from child method it must handled by  parent class
	
		
	   void msg() {//throws exception
       System.out.println("Test Exception Child");
		}
	
	   public static void main(String[] args) {
       Parent p = new MethodOverridingException();
		 p.msg();
		 }
	}
	
	

