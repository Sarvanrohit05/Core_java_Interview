package com.in.oops;


public   final class Immutable {
	
	private final String name ; 
	private final int age ; 
	
	public Immutable(String name , int age ) {
		this.name = name;
		this.age = age  ; 
		
	}
		public String getName() {
			return name ; 
		}
		
		public int getAge() {
			return age ; 
			
			
			
			
		}
		
		
		public static void main(String[] args) {
			Immutable obj = new Immutable("rohit", 21);
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
		}
	

}
