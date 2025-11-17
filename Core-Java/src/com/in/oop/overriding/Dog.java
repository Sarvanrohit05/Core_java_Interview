package com.in.oop.overriding;

public class Dog extends Animal {

	
	public void sound( ) {
		System.out.println("the dog barkkk");
		
	}
	   public static void main(String[] args) {
	
		   Dog obj2 = new Dog();//polyphorsim
           obj2.sound();
	 
	
	 Animal  obj = new Dog ();//that is runtime pollyphorism
	 
	obj.sound();//cLL WITH  child sound 
	   Animal  obj1 = new Animal();
	   obj1.sound();
	   
	   
	   
	 
}}
