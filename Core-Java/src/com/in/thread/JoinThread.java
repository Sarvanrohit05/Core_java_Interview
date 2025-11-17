package com.in.thread;

public class JoinThread extends Thread {
	
	public String name = null;
	
	public JoinThread(String name) {
      this.name = name ; 
	}

	
	@Override
	public void run() {
		
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(i + " " + name);
		} 
	}
}
  