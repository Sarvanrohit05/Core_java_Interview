package com.in.collection.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeNameTest {
	
	public static void main(String[] args) {
	List<Employee> list = new ArrayList();
	list.add(new Employee(1, "rat"));
	list.add(new Employee(34, "zebra"));
	list.add(new Employee(12, "apple"));
	
	list.stream().sorted(Comparator.comparing(Employee:: getName)).forEach(e ->
	System.out.println(e.getId()+ "=" + e.getName()));
	}

}
