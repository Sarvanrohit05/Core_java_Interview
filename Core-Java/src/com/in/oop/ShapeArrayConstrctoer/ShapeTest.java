package com.in.oop.ShapeArrayConstrctoer;

public class ShapeTest {
	
	
	public static void main(String[] args) {
		 Shape[] s = new Shape[2] ;
		 
		 s[0] = new  Circle(5);
		 s[1] = new Rectangle(10, 5);
		 
		 System.out.println( s[0].area());
		 System.out.println(s[1].area());
		 
		 double a = Area(s);
		   
			System.out.println(a);	 
	
	} 

	private static double Area(Shape[] s) { 
		// TODO Auto-generated method stub
		
		double totalArea = 0 ;
		for( Shape i : s) {
			totalArea += i.area() ; 
		}
		return totalArea;
	}
	
	

}
