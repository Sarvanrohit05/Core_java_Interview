package com.in.collection.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighSallery {

	
	 public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(30000);
		list.add(6000);
		list.add(1200);
		list.add(100000);
		list.add(100000);
		
		System.out.println("First Highest sallery");
		
		list.stream().distinct().sorted(Collections.reverseOrder()).findFirst().ifPresent(e ->  System.out.println(e));
		
		
		System.out.println("second Highest sallery");
		
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
		
		System.out.println("lowest Sallery");
		
		list.stream().distinct().sorted().findFirst().ifPresent(e -> System.out.println(e));
		
		System.out.println("second lowest sallery");
		
		list.stream().distinct().sorted().skip(1).findFirst().ifPresent(System.out::println);
	}
}
