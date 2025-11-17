package com.in.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestCorrectEmail {
	
	 public static void main(String[] args) throws Exception {
     FileReader file = new FileReader("C:\\Users\\ACER\\Desktop\\IO\\email.txt");
	  BufferedReader in = new BufferedReader(file);
	    FileWriter writer = new FileWriter("C:\\Users\\ACER\\Desktop\\IO\\correctemail.txt");
	    
	    PrintWriter out = new PrintWriter(writer) ; 
	    String reg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	     String line =  in.readLine() ;
	     
	     while(line != null) {
	    	 if(line.matches(reg)) {
	    		 out.println(line);
	    	 }
	    	 
	    	 line = in.readLine() ; 
	    	 
	     }
	   
	      out.close(); 
	      in.close();
	      System.out.println("done");
	 
	 
	 }

}
