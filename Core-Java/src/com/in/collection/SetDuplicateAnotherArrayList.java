package com.in.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicateAnotherArrayList {

	
	public static void main(String[] args) {
   
    List list =  new ArrayList();
    list.add(10);
    list.add(40);
    list.add(50);
    list.add(5);
    
    System.out.println(list);
    
    Set unique   = new HashSet();
    Set dublicate = new HashSet();
    
    for(Object o : list ) {
       if(!unique.add(o)) {
        dublicate.add(unique);
	}
}
     List dublicateList = new ArrayList(dublicate);
     List original = new ArrayList(unique);
     
     System.out.println("List" + list);
     System.out.println("oringal "+ original);
     System.out.println("dublicateList"+ dublicate);

     
     
     
	
	}}
