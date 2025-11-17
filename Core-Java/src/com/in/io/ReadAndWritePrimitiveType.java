package com.in.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveType {
	
	public static void main(String[] args) throws IOException {
		
		DataOutputStream   dataout = new DataOutputStream(new FileOutputStream("C:\\Users\\ACER\\Desktop\\IO\\rohit.txt"));
		dataout.writeInt(10);
		dataout.writeBoolean(true);
		dataout.writeDouble(45.34);
		dataout.writeFloat(2.5F);
		dataout.writeChar('r');
		  dataout.close();
		  
		  System.out.println("data addeddd ");
		  
		  
		  
		  DataInputStream input = new DataInputStream(new FileInputStream("C:\\Users\\ACER\\Desktop\\IO\\rohit.txt"));
		  
		  input.readInt();
		  input.readDouble();
		  input.readFloat() ; 
		  input.readChar();
		  input.close();
		  
		  input.close();
		  
		  System.out.println(input);
	}
	

}
