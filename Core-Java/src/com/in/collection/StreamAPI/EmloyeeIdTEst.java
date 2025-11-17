package com.in.collection.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmloyeeIdTEst {
	
	public static void main(String[] args) {
		List<Employee> list = new  ArrayList<>();
		
		list.add(new Employee(1, "rohit"));
		list.add(new Employee(12, "sanjay"));
		list.add(new Employee(56, "sagar"));
		list.add(new Employee(2, "golu"));
		
		
		list.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(e ->
		
				System.out.println(e.getId()+ "="  + e.getName()));

		
	}

}
