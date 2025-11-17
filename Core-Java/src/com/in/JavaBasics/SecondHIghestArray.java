package com.in.JavaBasics;

public class SecondHIghestArray {

	
	  public static void main(String[] args) {
		
		  
		   int [] num = {67,23,9,10,45};
		   int fHigh = 0;
		   int sHigh = 0 ; 
		   
		   for(int i = 0 ; i<num.length;i++) {
			   if(fHigh<num[i]) {
				sHigh  =  fHigh ;
				fHigh   = num[i];
			   }
			   if(sHigh<num[i]&& fHigh>num[i]) {
				     sHigh = num[i];
			   }
			   
		   }
		   System.out.println(sHigh);
	}
}
