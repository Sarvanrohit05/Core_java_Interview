package com.in.thread;

public class TestProirtyThread {
	
	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("abc");

		PriorityThread t2 = new PriorityThread("xyz");

		// Set thread priorities
		t1.setPriority(6); // Maximum priority
		t2.setPriority(1); // Minimum priority

		t1.start();

		t2.start();
	}

}
