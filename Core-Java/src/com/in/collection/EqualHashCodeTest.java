package com.in.collection;

public class EqualHashCodeTest {

	public static void main(String[] args) {

		EqualHashCode e1 = new EqualHashCode(1, "rohit", 2000);
		EqualHashCode e2 = new EqualHashCode(1, "sagar", 2000);

		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
