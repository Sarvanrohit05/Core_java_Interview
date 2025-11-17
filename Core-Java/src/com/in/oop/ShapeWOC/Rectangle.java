package com.in.oop.ShapeWOC;

public class Rectangle   extends Shape {

	public double length ; 
	
	public double width ; 
	
	
	
	public void setLength (double length) {
		this.length = length ; 
		
	}
	
	public double getLength() {
		return length ; 
		
	}
	
	
	
	public void setWidth(double width) {
		this.width = width  ;
		
	}
	
	
	public double getWidth() {
		return width  ;
	}
	
	public double area() {
		return length*width ; 
	}
	}
