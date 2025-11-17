package com.in.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestBySallery {
	
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Employee(1, "ritesh", 15000));
		list.add(new Employee(2, "ritesh", 1000));
		list.add(new Employee(3, "aahul", 14000));
		
	   EmployeeShortbySallery empSallery = new EmployeeShortbySallery();
	   Collections.sort(list, empSallery);
	       
	   Iterator  it = list.iterator();
	   
	   
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	}

}
