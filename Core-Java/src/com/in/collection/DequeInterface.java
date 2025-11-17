package com.in.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
	
	 
	public static void main(String[] args) {
		
		  
     Deque d  =  new ArrayDeque();
     
            d.offer(10);
            d.offer(20);
            d.offer(40);
            d.offer(70);
            d.offer(80);
       
       
       System.out.println("intial Deque " + d);
       
       
       System.out.println("Size of deque "+ d.size());
       
       
       //Add element to the front
       
       d.offerFirst(2);
		    
       System.out.println("After offerFirst "+ d);
       
       
       //Add elelement in Last
       d.offerLast(90);
       System.out.println("After offerLast " + d );
       
       
       System.out.println("peek (First element) " + d.peek()); 
       System.out.println(d.peek());
       /**
   	 * peek method just pick the element from array like i this program it will pick 2 but it dosen't remove elemenet from array 
   	 */
       
       
       System.out.println(d);
       
       System.out.println(d.poll());
       System.out.println(d.poll());
       System.out.println(d.poll());
       System.out.println(d);
      d.addLast(99);
      System.out.println(d);
		    
	}

}
