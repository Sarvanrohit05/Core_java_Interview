package com.in.oop.Constructer;


/**
 * @author Rohit Rajput
 * in this class sir remove the super keyword and ask what happen or what will be the output
 * so it gives a compilation error 
 * if parent class does  not have default constructor then we must need to call atleast one 
 * Parameterized constructor.
 * so in this case we simply define the default constructor in parent class
 */
 
  
public class TestConstructerCalling  extends ConstructerCalling{
	
	public TestConstructerCalling(String fName , String lName , String Adress) {
		super(fName , lName , Adress);
	}
	
	
	
	public static void main(String[] args) {
		TestConstructerCalling obj = new TestConstructerCalling("rohit", "rajput", "indore");
	}
	
	


	
}
