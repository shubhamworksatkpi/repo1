package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
	
	public static void LocalDateTimeApi()
	 
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		
		String formatedDateTime = current.format(format);
		System.out.println(formatedDateTime);
		
		//printing months, days and seconds
		Month month = current.getMonth();
		System.out.println(month);
		int day = current.getDayOfMonth();
		System.out.println(day);
		int seconds = current.getSecond();
		System.out.println(seconds);
		int hour = current.getHour();
		System.out.println(hour);
		int year = current.getYear();
		System.out.println(year);
		
		//printing some specified date
		LocalDate date2 = LocalDate.of(1950,1,26);
		System.out.println(date2);
		
		
		//printing date with current time
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
		System.out.println(specificDate);
		
		
	}
	
	public static void main(String[] args) { 
		
		LocalDateTimeApi();
	}
	
	}
