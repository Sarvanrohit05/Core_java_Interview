package com.in.oop.overriding;

public class CoustmerUser extends User {

	public CoustmerUser(String name) {
		super(name, "Coustmer");
		// TODO Auto-generated constructor stub
	}

	
	  @Override
	public void accessBoard() {
		// TODO Auto-generated method stub

	    System.out.println(name + "access the  coutmer dashboard with limited accesssss");
	  }
}
