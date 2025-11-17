package com.in.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AddandOfferdeffrence {
	
	
	public static void main(String[] args) {
		
		
    Queue s = new ArrayBlockingQueue(3);
    
    
    
    System.out.println(s.offer(10));
    System.out.println(s.offer(10));
    System.out.println(s.offer(10));
    System.out.println(s.offer(10));
    System.out.println(s.offer(20)); 
    
    
    try {
    	s.add(20);
    	s.add(40);
    	s.add(50);
    	s.add(80);
    	System.out.println(s);
    }catch(IllegalStateException e) {
    	System.out.println(e.getMessage()+ "array out of index");
    	
    }
    
	}

}
