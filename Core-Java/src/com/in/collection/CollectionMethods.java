package com.in.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {
	
	public static void main(String[] args) {
		
	 Collection  c   =  new ArrayList();
	 
	    c.add(100);
	    c.add(300);
	    c.add(400);
	    c.add(500);
		/*
		 * Iterator i = c.iterator(); while(i.hasNext()) { Object o = i.next();
		 * System.out.println(o); }
		 */
	  System.out.println(c.add(60)); 
	  System.out.println(c.size());
	  System.out.println(c.hashCode());
	  System.out.println(c.contains(400)); 
	  System.out.println(c);
	  System.out.println(c.addAll(c));
	  System.out.println(c.size());
	  System.out.println(c.contains(500));
	  System.out.println(c.containsAll(c)); 
	  System.out.println(c.remove(60));
	  System.out.println(c);
	  System.out.println(c.removeAll(c));
	  System.out.println(c);
	  System.out.println(c.isEmpty());
      System.out.println();
      	
	    
	 
	 
	}

}
