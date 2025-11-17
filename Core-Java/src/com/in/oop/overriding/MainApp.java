package com.in.oop.overriding;

public class MainApp {
	
	
	public static void main(String[] args) {
		  UserController user = new UserController();
		   User u1=     new AdminUser("rohit");
		     User u2         =  new   CoustmerUser ("golu");
		     
		    // user.dashboard(user);
		     user.dashboard(u1);
		     user.dashboard(u2);
		      
	}
	 

}
