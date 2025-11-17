package com.in.oop.ShapeArrayWMRT;

public class ShapeWMRT {
	
	
	public double area() {
		return 0 ; 
	}

	public  static ShapeWMRT getShape(int i ) {
		if(i==1) {
			return new Circle(10);
		}
		
		if(i==2) {
			return new Rectangle(10 , 10 );
		}
		
		
		return   new ShapeWMRT(); 
	}
	

}
