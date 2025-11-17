package com.in.io.extrnaliazble;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployyeExtrnalTest {
	
	public static void main(String[] args) throws Exception {
		Employee e = new Employee();
		e.id = 1;
		e.name = "yash";
		e.address = "indore";
		e.salary = 50000;

		FileOutputStream file = new FileOutputStream("C:\\Users\\ACER\\Desktop\\IO\\seriazle2.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(e);

		out.close();
		file.close();

		System.out.println("Object write successfully....!!!");

		FileInputStream file2 = new FileInputStream("C:\\Users\\ACER\\Desktop\\IO\\seriazle2.txt");

		ObjectInputStream in = new ObjectInputStream(file2);

		Employee e2 = (Employee) in.readObject();

		System.out.println("id = " + e.id);
		System.out.println("name = " + e.name);
		System.out.println("address = " + e.address);
		System.out.println("salary = " + e.salary);

		in.close();
		file.close();
	}

}
