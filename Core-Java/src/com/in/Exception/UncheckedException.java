package com.in.Exception;


public class UncheckedException {
	//LoginFlow
	
	
	public static void main(String[] args) {
		Portal();		
	}

	private static void Portal() {
		try {
			AuthenticateUser();
		
	   }catch(RuntimeException e) {
         e.printStackTrace();
          System.out.println("Login Failed : Exception  Handled at Portal");
		
	    }}

	private static void AuthenticateUser() {
		checkCredentials();
		
	}

	private static void checkCredentials() {
		throw new  RuntimeException("Invalid Password AND Password");
		
	}
	
	
}
