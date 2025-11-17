package com.in.collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseArralistWithLoop {
	
	public static void main(String[] args) {
		
	List list = new ArrayList();
	
	list.add(20);
    list.add(40);
    list.add(60);
    list.add(80);
    
    System.out.println(list);
    
       List reverselist =new ArrayList();
    for(int i = list.size()-1 ; i>=0; i--) {
         reverselist.add(list.get(i));
    
    }
    System.out.println(reverselist);
    
	}
}
