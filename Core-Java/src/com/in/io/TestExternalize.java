package com.in.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		StudentExternalizable s = new StudentExternalizable(10, "dip");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ACER\\Desktop\\IO\\External.txt"));
		
		out.writeObject(s);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\ACER\\Desktop\\IO\\External.txt"));
		
		s = (StudentExternalizable) in.readObject();
	
		System.out.println(s.getId());
		System.out.println(s.getName());
	
		out.close();
		in.close();
	}

}
