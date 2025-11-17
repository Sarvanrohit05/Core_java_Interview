package com.in.JavaBasics;

import java.util.Arrays;

public class Highest5Element {
	
	public static void main(String[] args) {
		
		int arr [] = {70,78,56,45,9,90,67};
		Arrays.sort(arr);
		
		for(int i = arr.length -5  ; i< arr.length ; i++) {
			System.out.print(" " +arr[i]);
		}
	}

}
