package com.in.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	
	public static void main(String[] args)throws Exception {
		
		DatagramSocket socket = new DatagramSocket(4455);
		
		System.out.println("server  is up and wiating for a client");
		
	    byte [] bt =	new byte[256];
	       
	      DatagramPacket packet = new DatagramPacket(bt,bt.length);
	      socket.receive(packet);
	      
	      String recieved = new String (packet.getData(),0 ,packet.getLength());
	      
	      System.out.println("recieved from client:" + recieved);
	      String response = "Hello from UDP serverrrrrr " ; 
          bt= response.getBytes();
          new DatagramPacket(bt, bt.length,packet.getAddress(),packet.getPort());
          socket.send(packet);
           socket.close();
           System.out.println("server closed ");
         
               
		
		
	}

}
