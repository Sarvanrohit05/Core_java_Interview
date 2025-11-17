package com.in.Exception;

public class ArrayIndexOutOfBoundException {
	
	
	public static void main(String[] args) {
		  int arr [] = {1,2,3,4,5,6};
		  try {
			  System.out.println(arr[6]);
		  }catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println(e);
		  }
	}

}
