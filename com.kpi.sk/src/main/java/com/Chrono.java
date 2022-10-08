package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono {
	
	// function to check ChronoUnit:when modification happens on certain fields
	public static void checckingChronoEnum()
	
	{
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//adding 2 years to the current date
		
		LocalDate year = date.plus(2,ChronoUnit.YEARS);
		System.out.println(year);
		
		//adding 1 month to the current date
	
		LocalDate nextMonth = date.plus(1,ChronoUnit.MONTHS);
		System.out.println(nextMonth);
		
		//adding 1 week to the current date
		
		LocalDate nextWeek = date.plus(1,ChronoUnit.WEEKS);
		System.out.println(nextWeek);
		
		//adding 20 years to the current date
		
		LocalDate decade = date.plus(2,ChronoUnit.DECADES);
		System.out.println(decade);
		
		
		
	}

public static void main(String[] args) { 
		
	checckingChronoEnum();
	}
}
