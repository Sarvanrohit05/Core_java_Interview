package com.in.collection.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestByShortByName {
	
	public static void main(String[] args) {
    
   List  list = new ArrayList();
         list.add(new Employee(1, "f", 2000));
         list.add(new Employee(2, "c", 3000));
         list.add(new Employee(3, "r", 4000));
         list.add(new Employee(4, "a", 7000));
         list.add(new Employee(78, "b", 4000));
         EmployeeShortByName empName = new EmployeeShortByName();
         Collections.sort(list, empName);
         
         
         list.forEach(System.out::println);
		/*
		 * Iterator it = list.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
	}

}
