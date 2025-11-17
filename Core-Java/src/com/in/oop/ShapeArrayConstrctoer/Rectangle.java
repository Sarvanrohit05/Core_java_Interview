package com.in.oop.ShapeArrayConstrctoer;

public class Rectangle extends Shape {
	
	
	public double width ; 
	 public double length ; 
	
	 
	 
	 public Rectangle(double  width , double length) {
		 this.length = length; 
		 this.width = width; 
	 }
	 
	 
	 public double area() {
		return length*width;
		 
	 }

}
