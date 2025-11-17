package com.in.oop.Constructer;

public class SimpleConstructor {
	
	String name ; 
	int age ; 
	
	public SimpleConstructor() {
		name = "rohit";
		age = 19 ; 
		
		
	}
	
	
	
	public void display() {
		System.out.println("name "+ name);
		System.out.println("age " + age);
	}
	
	
	public static void main(String[] args) {
		
		
		SimpleConstructor  sb = new SimpleConstructor();
		sb.display();
	}

}
