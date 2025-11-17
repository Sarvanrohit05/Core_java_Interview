package com.in.oop.Constructer;

public class ConstructerCalling {
	
	 String fName ; 
	 String lName; 
	 
	 String Adress ; 
	 
	 
	 public ConstructerCalling(String fName , String lName ) {
		 this.fName = fName ; 
		 this.lName =lName ; 
		 System.out.println(fName); 
		 System.out.println(lName);
	 }
	 
	 
	 public ConstructerCalling(String fName , String lName , String Adress) {
		 this(fName , lName);
		 
		 
		 this.Adress = Adress; 
		 System.out.println(Adress);
		 
		 
	 }
	
	}
