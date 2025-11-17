package com.in.JavaBasics;

public class PalidromeNo {
	
	
	public static void main(String[] args) {
		  int  num = 121 ; 
		  int num2 = num; 
		  int temp = 0  ;
		  int r = 0 ;
		  while(num2>0) {
			    r =   num2%10 ;
			     temp =    temp*10+r;
			     num2 =   num2/10 ; 
		  }
			if(temp==num)	{
				System.out.println("yes it is ");
			} else {
				System.out.println("it is not");
			}
	}

}
