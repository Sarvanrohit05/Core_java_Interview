package com.in.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadByChar {

	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("C:\\Users\\ACER\\Desktop\\IO\\hello.txt");

		int ch = in.read();

		while (ch != -1) {

			System.out.print((char) ch);

			ch = in.read();

		}
	}} 
