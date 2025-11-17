package com.in.JavaBasics;

public class FirstHighInArray {
	
	   public static void main(String[] args) {
         int arr[] ={67, 45,90 ,78, 45, 68};
         int temp = 0  ; 
         
         for(int i= 0 ; i<arr.length ; i++) {
        	        
        	 if(arr[i]>temp) {
        		temp =    arr[i];
        	//	System.out.println(temp);
        	 }
     		

         }
         System.out.println(temp);
	   
	   
	   } 

}
 