package com.in.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArray {
//reverse the list
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(80);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// list.add(null); //in this throw nullpointerexception if we want to sort and
		// reverse the order
		//list.add('b');//in this throw classCastexception if we want to sort and
		// reverse the order
 		Collections.sort(list);
		System.out.println("sort " + list);
		Collections.reverse(list);
		System.out.println("reverse " + list);

		/*
		 * Collections.sort(list, Collections.reverseOrder());
		 * 
		 * System.out.println(list);
		 */
		
		/*
		 * Iterator it = list.iterator();
		 * 
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */  
		 
	}

}
