package com.in.oop.overriding;

public class User {
	
	
	protected String name ; 
	
	protected  String role ;
	
	
	public User(String  name , String role) {
		this.name = name ; 
		this.role = role  ;
	}
	  public void accessBoard() {
		  System.out.println(name + " access  a general userboard");
	  }

}
