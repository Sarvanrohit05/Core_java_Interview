package com.in.Exception;

public class CheckedException {
	
	
	public static void main(String[] args) {
		
		try {
			ClientRequest();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
				
		}
	//in there methodCalling chain 
	public static void ClientRequest()throws Exception{
		database();
	}
	
	public static void database()throws Exception {
		server();
	}
	
	public static void server()throws Exception{
		//thorwing the Coustum Checked Exeption
	   throw new Exception("server proccessing the request ");
	
	}
	}


