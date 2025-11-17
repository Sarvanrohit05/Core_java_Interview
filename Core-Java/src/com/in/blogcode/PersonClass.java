package com.in.blogcode;
//this is immutable class 
public final  class PersonClass {
	
	private String name ; 
	private int age ; 
	private Adress adress ;
	
	
	public PersonClass (String name , int age , Adress adress) {
		this.name =name ; 
		this.age= age ; 
		
		this.adress = new Adress(adress.getStreet(), adress.getCity());
	
	}
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */	public int getAge() {
		return age;
	}

	/*
	 * public void setAge(int age) { this.age = age; }
	 */	public Adress getAdress() {
		return  new Adress(adress.getStreet(), adress.getCity());
	}
	/*
	 * public void setAdress(String adress) { this.adress = adress; }
	 */ 

}
