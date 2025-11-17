package com.in.oop.ShapeArrayWMRT;

import com.in.oop.ShapeArrayConstrctoer.Shape;

/**
 * @author ROHIT RAJPUT
 *  * the class full name is Shape Array with method return type

 *
 */
public class ShapeTestMWRT {
	
	 public static void main(String[] args) {
		 
		 
		    ShapeWMRT [] s   =   new ShapeWMRT[2] ;
		 s[0]          =    ShapeWMRT.getShape(1);
		    s[1]             =   ShapeWMRT.getShape(2);
		    
		    
		    System.out.println(s[0].area());
		    System.out.println(s[1].area());
		       
		double r   =   Area(s);
		System.out.println(r);
	 }
		 
		 
		 
		public static double Area(ShapeWMRT [] s) {
			double d = 0 ; 
			for(ShapeWMRT s1 : s ) {
			d	=   d+ s1.area() ;
			}
			
			return d ; 
		}
	}

