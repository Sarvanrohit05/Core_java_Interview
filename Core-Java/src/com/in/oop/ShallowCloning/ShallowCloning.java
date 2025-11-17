package com.in.oop.ShallowCloning;

public class ShallowCloning implements Cloneable {
	
	public int balance ; 
	
	protected Object clone() throws CloneNotSupportedException {
		  	return super.clone(); 	 
	}
	
	  public String toString() { 
		  return "ShallowCloning [balance=" + balance + "]";
	  }
	 
}
