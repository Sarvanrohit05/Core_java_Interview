package com.in.collection.comparator;

import java.util.Comparator;

public class EmployeeShortbySallery implements Comparator<Employee> {

	@Override
	public int compare(Employee  o1, Employee o2) {
        
		
		
		  if(o1.sallery == o2.sallery) { 
			  return 0;
		  
		  
		  }else if(o1.sallery>o2.sallery) {
			  return 1 ;
		  
		  
		  }else { 
			  return -1;
		  }
		  
	}}
		//return o1.getSallery()-o2.getSallery(); //in assecing
		//return o2.getSallery() - o1.getSallery();
		
		
		
			