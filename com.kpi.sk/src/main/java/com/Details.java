package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Details {

 public static void oct7details() {
		
	LocalDate localdate = LocalDate.now();
			LocalDate day = localdate.withDayOfYear(7).withYear(2030).withMonth(10);
			
			
LocalDate specificDate = day.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
System.out.println("DETAILS FOLLOWS : "+specificDate);}
 
public static void main(String args[]) 

{
oct7details(); }
	}


