package com.in.JavaBasics;

public class MisingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {1,4,3};
		int b[] = {1,4,0};			

		
		for(int i = 0 ; i<b.length ; i++) {
			boolean flag = false ; 
			for(int j = 0 ; j< a.length; j++) {

				if(b[i]==a[i]) {
				 	flag = true; 
					break ; 
				}
			}
			if(!flag) {
				System.out.println(b[i]);
			}
		}

	}

}
