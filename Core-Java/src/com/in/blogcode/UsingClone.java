package com.in.blogcode;



public class UsingClone implements Cloneable {
	
	public void display () {
		System.out.println("using clone object created ");
	}
	
	@Override
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	public static void main(String [] args) {
		try {
			  UsingClone obj = new UsingClone();
			  
			    UsingClone  clone = (UsingClone)  obj.clone();
			    clone.display();
		}catch(CloneNotSupportedException  e ) {
			e.printStackTrace();
			
		}
		
	}

}
