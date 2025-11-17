package com.in.excersize;

public class HousePattern {
	
	  public static void main(String[] args) {
		  int hight = 5 ;  //hieght of roof
		  int width = 9 ; //widthof house 
		  
		  //print roof 
		  for(int i = 0 ; i< hight ; i++ ) {
			  for(int j = 0 ; j<width ; j++) {
				  if(j==width/2 -i||j==width/2 +i) {
					  System.out.print("/");
					  
				  }else if(j>width/2 -i &&j<width/2 +i) {
					  System.out.print(" ");
				  }else {
					  System.out.print(" ");
				  }
			  }
			  System.out.println();
		  }
		  
		  //print roof base
		  for(int j = 0 ; j<width; j++) {
			  System.out.print("-");
		  }
		  System.out.println();
		  
		  //print walls 
		  
		  for(int i = 0 ; i<5 ; i++) {
			  for(int j = 0 ; j<width ; j++) {
				  if(j==0  ||j==width -1) {
					  System.out.print("|");
				  }else if(i>=2&&j>=3&&j<=5) {
					  System.out.print("O");//this is window 
				  }else {
					  System.out.print(" ");
				  }
			  }
			  System.out.println();
		  }
		  //print floor 
		  for(int j =0 ; j<width ; j++) {
			  System.out.print("=");
		  }
	}

}
