package com.in.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestById {
	
	public static void main(String[] args) {
   
		 List list= new ArrayList();
		 
		 list.add(new Employee(4, "rohit", 3000));
		 list.add(new Employee(2, "sagar", 4000));
		 list.add(new Employee(3, "golu", 1000));
		 
		 
		 EmployeeShortById empId = new EmployeeShortById(); 
         Collections.sort(list , empId); 
         
         
         list.forEach(System.out::println);

		/*
		 * Iterator it= list.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */         
                 
		
		 
		  
	}

}
