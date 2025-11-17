package com.in.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestShortByNameIdSallery {
	
	 public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Employee(1, "seema", 15000));
		list.add(new Employee(2, "mahesh", 12000));
		
		ShortByIdNameSallery  obj = new ShortByIdNameSallery();
		Collections.sort(list, obj);
		
		
        list.forEach(System.out::println);

		/*
		 * Iterator it = list.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
	}

}
