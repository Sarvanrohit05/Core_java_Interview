package com.in.networking;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {
	
	
	public static void main(String[] args) throws Exception{
		
	       	 ServerSocket server = new ServerSocket(12345);
		     System.out.println("server waiting for a client ");
		
		
	         Socket client=	 server.accept();
	         System.out.println("client connected");
	         
	         BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
	         DataOutputStream out = new DataOutputStream(client.getOutputStream());
	         out.writeBytes("hello client rohit \n");
	         
	         String s = in.readLine();
	         System.out.println("recieved from client rohitb  " + s);
	         client.close();
	         server.close();
	         System.out.println("Server closed");
	         
		
	}

}
