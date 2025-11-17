package com.in.JavaBasics;

public class CountNote {

	
	
	public static void main(String[] args) {
		//500 = 1  
		int [] note = {500,200,50,10};
		 int money = 999;
		 int count = 0 ;
		 
		 for(int i = 0 ; i<note.length ; i++) {
			   count     = money/note[i];
			    
			   if(count>0) {
				   System.out.println(note[i] + " "+ count);
				      money     =  money%note[i];
			   }
		 }
	}
}
