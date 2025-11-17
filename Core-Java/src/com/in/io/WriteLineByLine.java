package com.in.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLineByLine {
	
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\ACER\\Desktop\\IO\\write.txt" , true );
		 PrintWriter out = new PrintWriter(file);
		  out.println("hello dear");
		  out.println("what's going on ");
		  
		  
		  out.close();
		  
		  file.close();
		  
		  System.out.println("data wrtien  successfully");
	}

}
