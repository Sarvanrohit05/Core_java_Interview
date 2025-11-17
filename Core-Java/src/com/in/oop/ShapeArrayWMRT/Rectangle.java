package com.in.oop.ShapeArrayWMRT;

public class Rectangle  extends ShapeWMRT {
  
	
	public double length ; 
	public double  width ; 
	
	
	public Rectangle(double length , double width) {
		this.length = length ; 
		this.width = width ; 
	}
	
	
	public double area()
	{
		return length*width ;
	}	                                               
	}

