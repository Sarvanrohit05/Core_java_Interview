package com.in.JavaBasics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class AgeCount {

	
	  public static void main(String[] args) {
		     LocalDate ldate                =   LocalDate.now();
		   LocalDate  local =  LocalDate.of(2006, 01, 02);
		                 Period p=    Period.between(local, ldate);
		                              System.out.println(p.getYears()); 
		                             System.out.println(p.getMonths());
		                             System.out.println(p.getDays());
		                 
		   
	}
}
