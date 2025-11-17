package com.in.oop.MethodOverloading;

public class UserController {
	
	//method 1  Add user 
	
	public void proccess(UserBean user) {
		System.out.println("User Added " + user.name );
	}
	
	//method 2 search by userId 
	public void proccess(  int id) {
		System.out.println("searching by Id" + id);
	}
	
	
	//method 3 search by  user by username
  public void proccess(String name) {
     System.out.println("searching by name " + name); 
  }
  
  
  
   public static void main(String[] args) {
	    UserController controller = new UserController() ; 
	      UserBean  bean = new UserBean(1, "rohit");
	      
controller.proccess(1);
	      controller.proccess(bean);
	      controller.proccess("rohit");
}
}
