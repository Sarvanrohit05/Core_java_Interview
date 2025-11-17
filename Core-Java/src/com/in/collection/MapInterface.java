package com.in.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	
	public static void main(String[] args) {
   
    HashMap map = new HashMap();
        map.put(1, "rohit");
        map.put(2, "sanjay");
        map.put(3, "sagar");
        map.put(4, "golu");
        
    System.out.println(map); 
    System.out.println(map.containsKey(5));//it checks the value through by key if the same key exist then it will give in boolean value true/false
    System.out.println(map.isEmpty());
    System.out.println(map.containsValue("sagar"));////it checks the value through by value if the same value exist then it will in boolean value true/false
    System.out.println(map.get(4));//give value by key 
    System.out.println(map.entrySet());//check the value is it empty
    System.out.println(map.keySet());//give set of keys
    System.out.println(map.values());//give the list of values
    System.out.println(map.size());
    System.out.println(map.remove(3));
    
    System.out.println(map);
   
    System.out.println(">>>>>>>>><<<<<<<<<<<<<");
    System.out.println("TreeMap");
        
        TreeMap treemap = new TreeMap();
        
         treemap.put(5, 5000);
         treemap.put(6, 10000);
         treemap.put(7, 15000);
         treemap.put(11, 20000);
         
    
    System.out.println(treemap);
    //System.out.println(treemap.ceilingKey(8));
    System.out.println(treemap.firstKey());
    System.out.println(treemap.lastKey());
    System.out.println(treemap.firstEntry());
    System.out.println(treemap.lastEntry());
    System.out.println(treemap.keySet());
    System.out.println(treemap.values());
    System.out.println(treemap.size());
    System.out.println(treemap);
        
      
    System.out.println(">>>>>>>>><<<<<<<<<<<<");
    System.out.println("LinkedHashMap");
    
    LinkedHashMap   linkedmap = new LinkedHashMap();
        
       linkedmap.put('a', 2000);
       linkedmap.put('b', 4000);
       linkedmap.put('c', 6000);
       
    System.out.println(linkedmap);
    System.out.println(linkedmap.get('b'));
    System.out.println(linkedmap.containsKey('c'));
    System.out.println(linkedmap.containsValue(6000));
    System.out.println(linkedmap.keySet());
    System.out.println(linkedmap.values());
		
		
	}

}
