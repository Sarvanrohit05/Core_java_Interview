package com.in.collection.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class TestValue {
	//its not in sir code 
	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(10,20,30);
		
		list.stream().map(x -> x + 10).forEach(System.out::println);
		
	}

}
