package com.in.networking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MutliThreadedEchoServer extends Thread{
	
	public Socket client = null ; 
	
	public  MutliThreadedEchoServer(Socket clientsocket) {
		
		this.client = clientsocket;
		}
	
	@Override
	public void run() {
		
		try {
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			String  inputline ;
			
			while((inputline= in.readLine()) !=null) {
				System.out.println("Server Receved: "+ inputline );
				out.println(inputline + "..." + inputline);
				
				if("Bye".equalsIgnoreCase(inputline)) {
					break ;
				}
			}
			out.close();
			in.close();
			
		}catch(Exception e) {
			System.err.println("IOException in client communication " +e.getMessage());
			
		}
		
	}
	
	public static void main(String[] args) {
	  ServerSocket serversocket =null ;
	  boolean  isRunning = true ; 
	  
	  try {
		  serversocket =  new ServerSocket(5643);
		  System.out.println("echo server Started on 5643");
		  while(isRunning) {
			  Socket  clientsocket =  serversocket.accept();
			  System.out.println("New Client Connected" + clientsocket.getInetAddress()) ;
			  MutliThreadedEchoServer echoserver =  new MutliThreadedEchoServer(clientsocket);
			  echoserver.start();
		  }
	  }catch(IOException e ) {
	  System.err.println("could not start  server: "+e.getMessage());
	  
	  }finally {
		  if(serversocket!= null) {
		  try {
			  serversocket.close();
		  }catch(IOException e) {
			  System.err.println("could not  close server: "+e.getMessage());
			  
		  }
		  }
	  }
	  System.out.println("Echo Server Stopped ");
	}

}
