package com.in.JavaBasics;

public class RandomNo {
	
	 public static void main(String[] args) {
		 for(int i =0 ; i<5; i++) {
		int	 r= (int) ((Math.random()*1000)+999);
		System.out.println(r);
		 }
	}

}
