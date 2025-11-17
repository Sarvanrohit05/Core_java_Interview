package com.in.thread;

public class JoinThreadTest {
	
	
	public static void main(String[] args) {
		 JoinThread t1 = new JoinThread("abc");
		 JoinThread t2 = new JoinThread("xyz");
		 
		 t1.start();
		 
		 try {
			 t1.join();//wait for t1 complete...
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 
		 t2.start();
	}

}
