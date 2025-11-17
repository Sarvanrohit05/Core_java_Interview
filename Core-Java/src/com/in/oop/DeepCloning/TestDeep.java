package com.in.oop.DeepCloning;

/**
 * @author ROHIT RAJPUT
 * in this class sir first remove the c.cone method and then remove
 * Costumer class's no.clone() and ask the output 
 * 
 *
 */
public class TestDeep {
	
	
	 public static void main(String[] args)throws CloneNotSupportedException {
		
		 
		  Coustmer obj  =  new Coustmer("rohit");
		       Coustmer obj2      = (Coustmer)obj.clone();//
		       obj2.name = "rahul" ; 
		       obj2.number.balance = 123; 
		        	 
		       
		       System.out.println(obj.name);
		       System.out.println(obj.number.balance);
		       
		       
		       
		       System.out.println(obj2.name);
		       System.out.println(obj2.number.balance);
	}

}
