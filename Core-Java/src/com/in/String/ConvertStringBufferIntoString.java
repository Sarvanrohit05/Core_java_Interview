package com.in.String;

public class ConvertStringBufferIntoString {

	
	
	public static void main(String[] args) {
		
		String name = "rohit" ; 
		//System.out.println(name);
		
		StringBuffer sb = new StringBuffer() ; 
		
		sb.append(name);
		System.out.println(sb);
	}
}
