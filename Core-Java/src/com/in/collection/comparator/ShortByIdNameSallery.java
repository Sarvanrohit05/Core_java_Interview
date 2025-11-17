package com.in.collection.comparator;

import java.util.Comparator;

public class ShortByIdNameSallery implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.id == o2.id && o1.name.equals(o2.name)) {

			return o1.sallery - o2.sallery;

		} else if (o1.id == o2.id) {

			return o1.name.compareTo(o2.name);

		} else {
			return o1.id - o2.id;
		}

	
	}

}
