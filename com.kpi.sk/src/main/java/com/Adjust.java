package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
	
	public static void checkingAdjusters() {

	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	// to get the first day of next month
	LocalDate dayofnextmonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
	System.out.println(dayofnextmonth);
	
	// to get the next saturday
	LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	System.out.println(nextSaturday);
	
	// to get the first day of current month
	LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
	System.out.println(firstDay);
	
	}
	
	public static void main(String[] args) { 
		
		checkingAdjusters();
		}}
