package com.in.thread;

public class WithOutThreadTest {
	
	public static void main(String[] args) {
		WithOutThread t1 = new WithOutThread("abc");
		WithOutThread t2 = new WithOutThread("xyz");
		
		t1.run();
		t2.run();
	}

}
