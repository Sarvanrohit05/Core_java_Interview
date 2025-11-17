package com.in.collection.StreamAPI;

import java.util.stream.Stream;

public class StreamTOArray {
	public static void main(String[] args) {
		
	Stream<String> stringStreamm	=    Stream.of("a" , "b" , "c");
	String[] stringArray = stringStreamm.toArray(e ->  new String [e]);
	
	for(String  s : stringArray) {
		System.out.println(s);
		
	}
	//System.out.println(stringArray [1]);
	}

}
