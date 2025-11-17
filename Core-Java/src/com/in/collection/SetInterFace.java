package com.in.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterFace {
	
	
	
	public static void main(String[] args) {
		System.out.println("HashSet");
   //hashset
      HashSet  s  = new HashSet();
    
      s.add(100);
      s.add(200);
      s.add(300);
      s.add(400);
      
      System.out.println(s.contains(700));
      //return true and false if value exist it will retrun true 
      
      System.out.println(s.isEmpty());
      //if there is a nothing add it will give true false
      
         
      System.out.println(s.size());
      //it will tell size of value 
      
      
      System.out.println(s.remove(100));
      //it removes particular value 
      
      System.out.println();
      
      System.out.println(s);
      
      
      System.out.println("treeSet");
      //treeset
      
      TreeSet s1  =  new TreeSet();
      s1.add(250);
      s1.add(300);
      s1.add(500);
      s1.add(700);
      s1.add(900);
      System.out.println(s1);
      
      System.out.println(s1.contains(400));//check value is exist or not
      System.out.println(s1.ceiling(310)); //put value where  value under in another like 270 up to 300
      System.out.println(s1.first());//get first value from array like 250
      System.out.println(s1.last());//get last value from array like 900
      System.out.println(s1.pollFirst());//get the small value from index 
      System.out.println(s1.size());//check value size how much value in array 
      System.out.println(s1.pollLast());//get last value from array 
      System.out.println(s1);
      
      System.out.println("++++++++++++++++");
      
      
      //linkedHashSet
      System.out.println("LinkedHashset");
      
      LinkedHashSet s2= new LinkedHashSet();
      
      
      s2.add(50);
      s2.add(150);
      s2.add(340);
      s2.add(800);
      
      
      System.out.println(s2.contains(340));
      System.out.println(s2.isEmpty());
      System.out.println(s2.size());
      System.out.println(s2.remove(50));
      System.out.println(s2);
      System.out.println(s2.hashCode());
      System.out.println(s2.toArray());
      

	
	}

}
