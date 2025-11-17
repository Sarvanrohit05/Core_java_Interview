package com.in.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
	
	public static void main(String[] args) {
		
	 List list = new ArrayList();
	  list.add(10);
	  list.add(20);
	  list.add(40);
	  list.add(30);   
	  
	  
    Iterator it =  list.listIterator();
       //list.add(70);//if we add element here it will throw conuccurentmodificationexception 
       System.out.println(list);
    while(it.hasNext()) {
      System.out.println(it.next());
    }
	  
	}

}
