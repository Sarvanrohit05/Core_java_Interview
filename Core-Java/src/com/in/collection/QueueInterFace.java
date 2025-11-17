package com.in.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterFace {

	
	 public static void main(String[] args) {
		
	 Queue s = new PriorityQueue(); 
	
	 s.offer(10);
	 s.offer(5);
	 s.offer(20);
	// s.offer(null);if you store null it will give exception 
	 s.offer(30);
	 s.offer(40);
	 
	 System.out.println(s);
	 s.add(11);
	 
	 System.out.println(s);
	 
	 System.out.println(s.peek()+ "peek");
	 System.out.println(s.element() +"element");
	 System.out.println(s);
	 System.out.println(s.poll()+ "poll");
	 System.out.println(s.size()+ "size");
	 System.out.println(s.remove()+ "remove");
	 System.out.println(s);
	 
	 }
}
