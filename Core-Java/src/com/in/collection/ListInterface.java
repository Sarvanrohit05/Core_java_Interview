package com.in.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
	
	
	public static void main(String[] args) {
		
	System.out.println("ArrayList");
	 ArrayList list = new ArrayList();
	 list.add(40);
	 list.add(10);
	 list.add(20);
	 list.add(30);
	// list.add(null); in this we can add null value also
	 list.add("fifty");
	 list.add(27.5);
	 
	 System.out.println(list);
	 
	 System.out.println(list.get(4));//it helps to get index number of element
	 System.out.println(list.hashCode());//find hashCode number 
	 System.out.println(list.subList(0, 2));//it helps to find element into index criteria
	 System.out.println(list.indexOf("fifty"));//find  index number of element
	 System.out.println(list.lastIndexOf(27.5));//also help last index number of element
	 System.out.println(list.size());//find the size of array 
	 System.out.println(list);
	
	 System.out.println();
	 System.out.println("linkedList");
	 
	 
	 LinkedList linkedlist = new LinkedList();
	 
	 linkedlist.add('a');
	 linkedlist.add('b');
	 linkedlist.add('c');
	 linkedlist.add('d');
	 linkedlist.add(null);
	 
	 
	 System.out.println(linkedlist);
	 System.out.println(linkedlist.subList(0, 3));
	// System.out.println(list2);
     System.out.println(linkedlist.get(3));
	 System.out.println(linkedlist.peek());
	 //System.out.println(list2.poll());
	 System.out.println(linkedlist.getFirst());
	 System.out.println(linkedlist.getLast());
	 System.out.println(linkedlist.poll());
	 System.out.println(linkedlist.pop());//remove element from array 
     System.out.println(linkedlist);
	
	 System.out.println();
	 System.out.println("Stack");
	 
	 Stack stack = new Stack();
	 stack.push(10);
	 stack.push(20);
	 stack.push(30);
	 stack.push(40);
	// stack.add(null);//store null value ALSO 
	 
	System.out.println(stack);
	 
    System.out.println(stack.search(4));
    System.out.println(stack.get(3));
    System.out.println(stack.empty());
    System.out.println(stack.peek());
    System.out.println(stack.pop());//remove value from array
    System.out.println(stack);
	System.out.println(); 
	System.out.println("vector");
	 
	 Vector vector = new Vector();
	 
	 vector.add(20);
	 vector.add(40);
	 vector.add(60);
	 vector.add(80);
	// vector.add(null);  //store null value also 
	 
	 System.out.println(vector);
	 
	 System.out.println(vector.get(2));
	 System.out.println(vector.contains(60));//if element in vectoer in will true or if isnt it will return false
	 System.out.println(vector.elementAt(3));
	 System.out.println(vector.hashCode());
	 System.out.println(vector.capacity());
	 
	}

}
