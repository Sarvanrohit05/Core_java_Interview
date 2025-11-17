package com.in.collection.comparator;

public class Employee {
	  
	
	int id ; 
	String name ; 
	int sallery;
	
	public Employee(int id , String name , int sallery) {
		this.id = id ; 
		this.name = name ;
		this.sallery = sallery ;
		 
	}
	
	
	
	 @Override
	public String toString() {
		return "ID = " + id + " " + "NAME =" + name +" " +  "SALLERY = " +  sallery ; 
	}

}
