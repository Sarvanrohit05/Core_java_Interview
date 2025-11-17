package com.in.JavaBasics;

public class MethodCalling {
	
	  public static int  doStuff(int [] arr,int  num) {
		  for(int i = 0 ; i<arr.length; i++) {
			  if(num==arr[i]) {
				    return i ;
				    
			  }
		  }
		  return -1 ; 
		  
	  }
	  

	  
	    public static void main(String[] args) {
			  int []  arr = {2,4 ,5,6};
			  int num =6;
			  int doStuff = doStuff(arr, num);
			  
			   if(doStuff!= -1) {
			  System.out.println(doStuff);
		}else {
			System.out.println(doStuff);
		}
}
}