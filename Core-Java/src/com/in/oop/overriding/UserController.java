package com.in.oop.overriding;

public class UserController {
	
	
	public void dashboard(User user) {
		//polyphorism in action
		//at the runtime beacuse after comilation method willv be confsued which class can be call on that time controller class decide which is it ...
		
		user.accessBoard();
	}
	
	
	  public static void main(String[] args) {
		  UserController ctl = new  UserController();
	            User u = new User("hmendra", "Employee");
	          User u1= new AdminUser("rohit"); //normal polyphorsim
	       User u2 = new CoustmerUser ("golu");
	  
	  
	      ctl.dashboard(u);
	       ctl.dashboard(u1);
	       ctl.dashboard(u2);
	  
	  }
	 
}
