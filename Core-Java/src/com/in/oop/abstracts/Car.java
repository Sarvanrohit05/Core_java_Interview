package com.in.oop.abstracts;

public class Car  extends Vhicle{
	
	@Override
	 void start() {
		System.out.println("car engine start ");
	}

	public Car(String brand, int speed) {
		super(brand, speed);
		// TODO Auto-generated constructor stub
	}
	 
	
	 public static void main(String[] args) {
		  Car c =  new Car("tesla", 120);
		  Car C1 = 	 new Car("ferrari", 140);
		  
		  c.getInfo();
		  c.start();
		  
		  C1.getInfo();
	}
	
	  
	

}
