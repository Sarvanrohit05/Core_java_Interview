package com.in.thread;

public class TestRacing {

	
	public static void main(String[] args) {
		Racing r1 = new Racing("abc");
		Racing r2 = new Racing("xyz");
		
		r1.start();
		r2.start();
		
	}}