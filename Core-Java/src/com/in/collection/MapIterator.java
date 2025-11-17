package com.in.collection;

import java.util.HashMap;

public class MapIterator {
	
	public static void main(String[] args) {
		
		
		HashMap map = new HashMap(); 
		
		map.put(1, "rohit");
		map.put(2, "sanjay");
		map.put(3, "titu");
		
		//System.out.println(map);
		
		
	  for(Object o:map.entrySet()){
		  //map.entrySet() → returns a Set of all key-value pairs.
	   System.out.println(o);
	  //System.out.println(map);
		 }
	  System.out.println();
	  for(Object o : map.values()) {
		 // map.values() → returns all values from the map.
	  System.out.println(o);	  
	  }
	
	 for(Object o : map.keySet()) {
		 //map.keySet() → returns all keys from the map.
		 System.out.println(o);
	 }
	
	}

}
