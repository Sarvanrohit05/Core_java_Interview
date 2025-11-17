package com.in.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {

		
		EqualHashCode e1 = new EqualHashCode(1, "xyz", 1000);

		EqualHashCode e2 = new EqualHashCode(1, "abc", 1000);
		
		EqualHashCode e3 = new EqualHashCode(1, "abc", 1000);

         
		
		  System.out.println("Arraylist");
		  List list = new ArrayList(); 
		  list.add(e1);
		  list.add(e2);
		  list.add(e3); 
		  System.out.println(list); 
		  list.remove(e3);
		  System.out.println("after remove " + list);
		 
		
		  System.out.println("HAshMap"); Map map = new HashMap();
		  
		  map.put(e1, "one");
		  
		  map.put(e2, "two"); map.put(e3, "teen");
		  
		  System.out.println(map);
		  
		  
		  
		
		  System.out.println("Hashset"); Set set = new HashSet(); set.add(e1);
		  set.add(e2); System.out.println(set);
		 	    
		
		
	}
}
