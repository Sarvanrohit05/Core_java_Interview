package com.in.collection.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalleryGreaterThan {

	
	public static void main(String[] args) {
		List<EmpSortSallery>list = new ArrayList<>();
		list.add( new EmpSortSallery ("rohit", 30000));
		list.add( new EmpSortSallery ("sagar", 2300));
		list.add( new EmpSortSallery ("vatsalya", 450000));
		list.add( new EmpSortSallery ("sanjay", 3000)); 
		
        List<EmpSortSallery>highPaidEmployee = list.stream().filter(employee -> employee.getSallery()>20000)
		   .collect(Collectors.toCollection(ArrayList::new));
		      
		    highPaidEmployee.forEach(e -> System.out.println(e.getName() + " " + e.getSallery()));
	}
	
}
