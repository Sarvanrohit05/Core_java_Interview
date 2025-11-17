package com.in.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestShortByIdName {
	
	
	public static void main(String[] args) {
	
    List list = new ArrayList();
    list.add(new Employee(11, "rohit", 1000));
    list.add(new Employee(1, "rohit", 1000));
    list.add(new Employee(2, "harsh", 2000));
    list.add(new Employee(3, "sagar", 3000));
    
    ShortByIdName empIdName = new ShortByIdName();
    Collections.sort(list, empIdName);
		
    list.forEach(System.out::println);

    /*
		 * Iterator it =list.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next());
		 * 
		 * }
		 */ 
	 
	}

}
