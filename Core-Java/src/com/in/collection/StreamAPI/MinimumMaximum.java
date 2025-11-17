package com.in.collection.StreamAPI;

import java.util.Arrays;

public class MinimumMaximum {
	
	public static void main(String[] args) {
		int [] i = {1 , 3 , 5 , 23, 52};
		 
		Arrays.stream(i).max().ifPresent(e ->
		System.out.println("maximum " + e)); 
		
		
		Arrays.stream(i).min().ifPresent(e ->
		System.out.println("minimum " + e)); 
	}

}
