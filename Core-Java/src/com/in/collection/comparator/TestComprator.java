package com.in.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComprator {
	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(new Employee( 3,"kapil", 2000));
		l.add(new Employee( 2,"kapil", 2000));
		l.add(new Employee(1,"kapil", 23000));

		EmployeeShortByName byName = new EmployeeShortByName();

		Collections.sort(l, byName);

		System.out.println("short by name");

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------------");
		
		EmployeeShortById byId = new EmployeeShortById();
		
		Collections.sort(l, byId);
		
		System.out.println("Sort by Id");
		
		
		
        l.forEach(System.out::println);

		/*
		 * Iterator it1 = l.iterator();
		 * 
		 * while(it1.hasNext()) { System.out.println(it1.next()); }
		 */
	}

}
