package com.in.collection;

import java.util.Stack;

public class StackHolding {
	
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		  
		
		for(int i = 'a' ; i<= 'z'; i++) {
			System.out.print(s.push(i) + " ");
		}
		
		System.out.println();
		
		Stack s1 = new Stack();
		
		while(!s.isEmpty()) {
			System.out.print(s1.push(s.pop())+ " ");
		}
		
		System.out.println();
		
		while(!s1.isEmpty()) {
			System.out.print(s.push(s1.pop())+ " ");
		}
	}

}
