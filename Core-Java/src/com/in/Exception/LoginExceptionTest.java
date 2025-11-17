package com.in.Exception;

public class LoginExceptionTest {

	public static void main(String[] args) {
		
	    System.out.println("before");
		 String  login  = "Admin";
		 
		 String Password = "admin123";
		 
		 
		 if(login.equals("Admin")&& Password.equals("admin1234")){
			 
			 System.out.println("login successfully");
			 
		 }else {
			 LoginException e = new LoginException("Invalid  User Id  and Password");
		 
		try {
			throw e ; 
		}catch(LoginException e1) {
			System.out.println(e1);
		}
	 }
		
		System.out.println("after");
	}
}
