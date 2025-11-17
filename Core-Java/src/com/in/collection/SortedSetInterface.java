package com.in.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {

	   public static void main(String[] args) {
		    
		SortedSet  st =   new TreeSet();
		
		//Add element in treSet
		
		st.add(80);
		st.add(80);
		st.add(45);
		st.add(35);
		st.add(25);
		st.add(15);
		//st.add(null);  if you stored null value it will give null pointerExcpetion
		
		System.out.println(st);
	//	System.out.println(st.add(null));
		
		System.out.println(st.first());//print smallest element 
		
		System.out.println(st.last());//print Highest element in Array
		
		System.out.println(st.size());//print the size of array
		
		System.out.println(st.tailSet(35));// check the condition if greater avalue print 35
		
		System.out.println(st.headSet(50));//give the value less value print  50
		
		System.out.println(st.subSet(23, 45));//give the value between 23 to 45 
	}
}
