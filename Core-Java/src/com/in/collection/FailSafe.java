package com.in.collection;

import java.util.Enumeration;
import java.util.Vector;



/**
 * @author 
 *
 */
public class FailSafe {

	public static void main(String[] args) {
	
		  Vector v = new Vector();
		  
		  v.add(2);
		  v.add('a');
		  v.add('b');
		  v.add('c');
		  v.add('e');
		  
		  
		  //System.out.println(v);
		 // System.out.println(v.hashCode());
		  
		  Enumeration s = v.elements();
		  
		  v.add(1);
		  v.remove(2);
		 v.add(null);
		 // System.out.println(v);
		  
		  while(s.hasMoreElements()) {
			  System.out.println(s.nextElement());
		  }
		  
		  
		  
	   
		

		
	}

}
