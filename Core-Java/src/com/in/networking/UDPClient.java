package com.in.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	
	public static void main(String[] args)throws Exception {
		
		DatagramSocket socket =  new DatagramSocket();
		byte[] bt = "hello from UDP CLient".getBytes();
		InetAddress adress =  InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(bt, bt.length , adress , 4455);
		socket.send(packet);
		 bt =   new byte[256];
		 packet = new DatagramPacket(bt , bt.length);
		 socket.receive(packet);
		 String recieved =  new String(packet.getData(), 0 , packet.getLength());
		 System.out.println("Quote of the moment : "+ recieved);
		
		
	}

}
