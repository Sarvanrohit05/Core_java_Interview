
package com.in.networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket; 

public class TCPClient {

	
	
	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("localhost" , 12345);
		System.out.println("connected to server");
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		DataOutputStream out = new  DataOutputStream(client.getOutputStream());
		out.writeBytes("hello server");
		 
		String s =  in.readLine();
		System.out.println();
		System.out.println("recieved from server" + s);
		client.close();
		System.out.println("client closed");
		
		
		
	}
}
