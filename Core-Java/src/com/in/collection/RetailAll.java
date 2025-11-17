package com.in.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class RetailAll {
	
	
	/**
	 * retainAll method 	
	 *
	 */

	
    public static void main(String[] args) {
	
    	Collection c1 = new ArrayList();
    	c1.add(10);
    	c1.add("rohit");
    	c1.add('a');
    	c1.add(78);

    	Collection c2 = new ArrayList();
    	c2.add(20);
    	c2.add("rohit");
    	c2.add(70);
    	c2.add('a');
    	c2.add(10);

    	System.out.println("C1 before retainAll: " + c1);
    	System.out.println("C2 before retainAll: " + c2);

    	c1.retainAll(c2);

    	System.out.println("C1 after retainAll: " + c1);
    	System.out.println("C2 after retainAll: " + c2); 
    	
    
	}
}
