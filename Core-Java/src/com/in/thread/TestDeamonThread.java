package com.in.thread;



/**
 * Daemon threads are background threads — jo main thread (ya user threads) ke kaam khatam hone tak hi chalte hain.
Jab saare non-daemon (user) threads khatam ho jaate hain, JVM automatically daemon threads ko terminate kar deti hai — bina unke khatam hone ka wait kiye.
chahe deamon main multiple loop hi kyu na lge ho
 *
 */
public class TestDeamonThread {
	
	public static void main(String[] args) {
		BackGroundThread b1 = new BackGroundThread("abc");
		b1.setDaemon(true);
		
		b1.start();
		
		for(int i = 1  ; i<=10 ; i++) {
			try {
				Thread.sleep(200);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
			
			System.out.println(i + "main ");
		}
	}

}
