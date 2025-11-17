package com.in.oop.implcitnexplcit;

public class ExplicitTest  extends Explicit {

	public ExplicitTest(String name) {
		super(name);
		System.out.println("itwill call after supercalss constructer");

		//System.out.println(name +  " withsuper");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ExplicitTest obj = new ExplicitTest("rohit");
	}

}
