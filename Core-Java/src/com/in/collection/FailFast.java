package com.in.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
    

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(25);
		//l.add(null);
		
		/**
		 * Here if we add null value it will be addedd in queue 
		 */

		
		
		Iterator it = l.iterator();
	   l.add(20);
	   l.add(30);
		/**
		 * l.add(40); or l.add(null);
		 * if we add elements or null  values here it will give conucurrentmodificationexception 
		 */
		
	while(it.hasNext()) {
		 
		 System.out.println(it.next()); }
		 
		

	}
}

 
 class FailFastwithArrayblockQueue{
	
	
		public static void main(String[] args) {
		
		ArrayBlockingQueue s = new ArrayBlockingQueue(3);
		s.add(10);
		s.add(20);
		s.add(10);
		//s.add(null);  //if we wanna add null value it will throw exception nullpointerexception
	
		
		     Iterator it = s.iterator();
		     /**
		      * s.add(56);
		 	 * IF We ADD ELEMENT HERE IT WILL GIVE EXCEPTION ILEGELSTATEEXCEPTION 
		 	 */
       		     
		     
		     
		     while(it.hasNext()) {
		    	 System.out.println(it.next());
		     }
	}
}
