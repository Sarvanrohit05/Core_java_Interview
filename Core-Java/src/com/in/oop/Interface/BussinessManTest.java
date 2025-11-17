package com.in.oop.Interface;

public class BussinessManTest {
	
	public void  Rich() {
		
		System.out.println(RichPerson.name);
	}
	public void social() {
		System.out.println(SocialWorker.name);
	}
	
	
	public static void main(String[] args) {
		BussinessManTest  test = new BussinessManTest() ;
		  
		  System.out.println("socail worker is ");
		SocialWorker obj2    = new BussinessMan();
		test.social();
		obj2.heltToOthers();
		
		System.out.println();
		System.out.println("richMan is ");
		
		
		RichPerson obj3 = new BussinessMan() ;
		test.Rich();
		obj3.donation();
		obj3.earnmoney();
		obj3.party();
		System.out.println();
		BussinessMan  obj = new BussinessMan();
		
		  obj.earnmoney();
		  obj.heltToOthers();
		
			
			
		
	}

}
