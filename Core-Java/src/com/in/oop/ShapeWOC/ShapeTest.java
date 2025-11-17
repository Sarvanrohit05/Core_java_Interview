package com.in.oop.ShapeWOC;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		    Shape [] s = new Shape [2] ;
		    
		    s[0]=  new Circle();
		    s[1] = new Rectangle() ; 
		    
	 Circle c 	 =   (Circle) s[0] ;
	 c.setRadius(10);
		
	 Rectangle r    =  (Rectangle) s[1];
	 r.setLength(10);
	 r.setWidth(10);
		System.out.println(s[0].area());
		
		System.out.println(s[1].area());
		
		   double a =     Area(s);
		   System.out.println(a);
	}
	
	
	
	/*
	 * public static double Area (Shape []s ) { double totalArea = 0 ; for(int i = 0
	 * ; i<s.length ; i++) { totalArea = totalArea+ s[i].area() ;
	 * 
	 * } return totalArea; }
	 */
	public static double Area (Shape [] s) {
		double td  = 0 ; 
		for(Shape s1 : s) {
		
			td=td+ s1.area() ; 
		}
		
		return td;
		   
	}

}

