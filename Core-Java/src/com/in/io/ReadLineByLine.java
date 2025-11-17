package com.in.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLineByLine {
 
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\ACER\\Desktop\\IO\\hello.txt");
		
		BufferedReader in  = new BufferedReader(file);
		
		String line =  in.readLine();
		
		while(line != null) {
			System.out.print(line);
			line = in.readLine() ;
			
		}
		
		in.close();
		file.close();
	}
}
