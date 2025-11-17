package com.in.io.extrnaliazble;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeExterout {
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
	}

}
