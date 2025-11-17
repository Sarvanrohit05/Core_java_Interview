package com.in.Exception;

public class TryCatchFinally {
	
	       public static void main(String[] args) {
			
	       try {
	    	   String name = null ;
	    	   System.out.println(name.length());
	       
	       }catch(NullPointerException e) {
	    	     System.out.println(e);
	 			//System.exit(0);// Program terminates here

	       }finally {
	    	       System.out.println("this is  Finally block ");
                     System.exit(0);
	       
	       }
		}

}
