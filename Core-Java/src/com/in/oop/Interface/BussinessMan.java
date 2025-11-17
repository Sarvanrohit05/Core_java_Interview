package com.in.oop.Interface;

public class BussinessMan implements RichPerson, SocialWorker {

	@Override
	public void heltToOthers() {
		System.out.println("helping hand");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int earnmoney() {
		// TODO Auto-generated method stub
		int i = 20000 ;
		
		System.out.println("earn money is " + i );
		return i;
	}

	@Override
	public void party() {
		System.out.println("do party somtime");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int donation() {
		// TODO Auto-generated method stub
		
		int i = 50000;
		System.out.println("donate amount is" + i );
		return i;
	}
	
	
	
	
	
	
	
}
