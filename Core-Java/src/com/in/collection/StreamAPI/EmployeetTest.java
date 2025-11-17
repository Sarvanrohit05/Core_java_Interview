package com.in.collection.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeetTest {
	
	public static void main(String[] args) {
		List<Employee>list = new ArrayList();
		list.add(new Employee(12, "rohit"));
		list.add(new Employee(5, "a"));
		list.add(new Employee(3, "d"));
		list.add(new Employee(1, "c"));
		
		list.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(e ->
		System.out.println(e.getId()+ "=" + e.getName()));


		
	}
	

}
