package com.in.oop.ShallowCloning;

public class ShallowCloningTest {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		   ShallowCloning obj = new ShallowCloning() ; 
		   
		   obj.balance = 100 ; 
		   
		   ShallowCloning obj2 = (ShallowCloning)obj.clone();
		   obj2.balance= 300 ; 
		   
		   System.out.println(obj);
		   System.out.println(obj2);
	}

}
  