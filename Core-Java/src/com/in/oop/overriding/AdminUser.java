package com.in.oop.overriding;

public class AdminUser extends User {

	public AdminUser(String name) {
		super(name, "ADMIN");
		// TODO Auto-generated constructor stub
	}
	
	
	public void accessBoard() {
		System.out.println( name + "accesss the Admin dashboard with all controls ");
	}
	}