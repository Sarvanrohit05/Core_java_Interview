package com.in.oop.abstracts;

public   abstract class Vhicle {
	
	
	
	  int speed ; 
	  String brand ; 
	  
	    public Vhicle(String brand , int speed) {
	    this.speed = speed ; 
	    this.brand = brand ; 
	    
	    
	    }
	    abstract void start();
	    public void  getInfo() {
	    	
	    	System.out.println("vhicle  speed is  " + speed );
	    	System.out.println("vhicle brand is " + brand);
	    }
	    }


