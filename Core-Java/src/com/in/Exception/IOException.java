package com.in.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class IOException {
	
	public static void main(String[] args) {
		try {
			
			FileReader  reader = new FileReader("fileNotExixst.txt");
			int data ; 
			while((data= reader.read()) != -1) {
				System.out.println(data);
			}
			 	
		}catch(FileNotFoundException e ) {
			System.out.println(e);
		}catch(java.io.IOException e) {
			System.out.println(e);
		}
		         
	}

}
