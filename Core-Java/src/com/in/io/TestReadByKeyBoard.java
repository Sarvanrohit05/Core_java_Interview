package com.in.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class TestReadByKeyBoard {
      
	  public static void main(String[] args) throws Exception {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			FileWriter fw = new FileWriter("C:\\Users\\ACER\\Desktop\\IO\\keyboard.txt", true);

			System.out.println("enter here.....");

			String str = br.readLine();

			while (str != null) {
		//	while(!str.equals("bye")) {
				fw.write(str);

				System.out.println(str);
				str = br.readLine();
				
			}
			br.close();
	  }
	  }
