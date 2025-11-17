package com.in.collection.comparator;

import java.util.Comparator;

public class ShortByIdName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
        if(o1.id==o2.id) {
        return o1.name.compareTo(o2.name);
        }else {
        	
        	return o1.id-o2.id;
        }
		
	}

}
