package com.in.JavaBasics;

public class SwitchCase {
	
	public static void main(String[] args) {
		  int a = 4 ; 
		  int b = 5; 
		   
		  char operator ='*';
		  
		  switch(operator) {
		  case '+'  : 
			  System.out.println("result "+ (a+b));
			  break  ;
			  
		  case'-':
			  System.out.println("result" + (a-b));
			  break ;
			  
		  case '*':
			  System.out.println("result" + (a*b));
			  break ; 
		  case '/':
			  if(b!=0) {
			  System.out.println("result" + (a/b));
		  }else {
			  System.out.println("cannot not be divided with zero");
			  
		  }
			  break ; 
			  default :
				  System.out.println("invalid operator");
			  }
	}

}
