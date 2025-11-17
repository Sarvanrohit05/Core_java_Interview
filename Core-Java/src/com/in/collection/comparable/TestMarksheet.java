package com.in.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet  {
  
	 public static void main(String[] args) {
		 List<MarkSheet> list = new ArrayList<>();
		 list.add(new MarkSheet(100, 76, "rohit"));
		 list.add(new MarkSheet(99, 56, "rohit"));
		 list.add(new MarkSheet(100, 87, "golu")); 
		 list.add(new MarkSheet(12, 98, "sagar"));
		 list.add(new MarkSheet(100, 78, "ajay"));
		// list.add(new MarkSheet(rollNo, Physics, name))
		 list.forEach(System.out::println);
		 
		 System.out.println("<<<<>>>>> After Sorting ");
		 Collections.sort(list);
		 list.forEach(System.out::println);

	}
}
