package com.in.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileSplit {
   public static void main(String[] args) throws Exception {
	
	   // To count no of line 
	    String s ="C:\\Users\\ACER\\Desktop\\IO\\split.txt";
	    int count  = 0 ; 
	    
	    int no1 = 2 ; 
	     
	     File file = new File(s);
	     Scanner sc = new Scanner(file);
	      while(sc.hasNext()) {
	    	  sc.nextLine();
	    	  count++ ;
	      }
	     System.out.println("no of  line " +count);
	     
    
          //To create No of file
          int temp =  count / no1 ;
          int rem  = count%no1 ;
          int nof = temp ;
     
        if(rem != 0 ) {
    	 nof++;
         } 
        
        System.out.println("No of file " + nof);
     
        //here we read  file data 
        
        BufferedReader br = new BufferedReader(new FileReader(s));
        
        //here we create files nof
        
        for(int  i = 1  ; i<=nof ; i++ ) {
        BufferedWriter bw = new BufferedWriter(new  FileWriter("C:\\Users\\ACER\\Desktop\\IO\\split.txt after split" + i  + ".txt"));
        
        
        //here we write no1 files 
        
        for(int j =  1 ; j<=no1 ; j++) {
        String  str =  br.readLine() ;
        if(str!= null) {
        	bw.write(str);
        	
        	//here we check if j not = nol then we write data to new line
        	
        	if(j!=no1) {
        		bw.newLine();
        	}
        }
        
        }
        bw.close();
        }
}}
