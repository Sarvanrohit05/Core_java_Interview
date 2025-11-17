package com.in.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\ACER\\Desktop\\IO\\rohit1.txt");
				
		BufferedReader br = new BufferedReader(  new FileReader("C:\\Users\\ACER\\Desktop\\IO\\rohit2.txt"));
	    String s1 = br.readLine() ;
	    while(s1!= null) {
	    	file.write(s1);
	    	s1 = br.readLine();
	    }
	    br.close();
	    
	}

}
