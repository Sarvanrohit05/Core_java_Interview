package com.in.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestBinary {
	
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream  in = new  FileInputStream("C:\\Users\\ACER\\Desktop\\image.png") ; 
	
	   FileOutputStream out = new FileOutputStream("C:\\Users\\ACER\\Desktop\\image2.png");
	     int  ch = in.read() ; 
	     while(ch!= -1) {
      out.write(ch);
        ch =   in.read() ;
        
        
	}
  out.close();
  in.close();
	}
}
