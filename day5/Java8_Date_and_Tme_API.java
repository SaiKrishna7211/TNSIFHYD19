package com.day5;

import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class Java8_Date_and_Tme_API {
	
	public static void DateAndTime() {
		
		LocalDate ld=LocalDate.now();
		System.out.println("the current date is: "+ld);
		
		LocalTime lt=LocalTime.now();
		System.out.println("the current time is: "+lt);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("the current date and time is: "+current);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM:SS");
		String formattedDateTime=current.format(dtf);
		System.out.println("formatted date and time is: "+formattedDateTime);
		
		Month month=current.getMonth();
		int day=current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month: "+month+" day: "+day+" seconds "+seconds);
		
	}
	public static void ZonedDateAndTime() {
		
		ZonedDateTime zoned=ZonedDateTime.now();
		System.out.println("the current zone is: "+zoned.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		 
	    ZonedDateTime tokyoZone =
	            zoned.withZoneSameInstant(tokyo);
	                   
	    System.out.println("tokyo time zone is " + 
	                        tokyoZone);
	}
	public static void CheckingPeriodAndDuration() {
		
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2025, 4, 10);
		Period gap=Period.between(date1, date2);
		System.out.println("gap  between two dates is : "+gap);
		
		LocalTime time1=LocalTime.now();
		LocalTime time2=time1.plusHours(67);
		Duration  d=Duration.between(time1, time2);
		System.out.println("duration between two times is : "+d);
	}
	public static void CheckingChronoUnit() {
		
		LocalDate date=LocalDate.now();
		
		LocalDate years=date.plus(2,ChronoUnit.YEARS);
		System.out.println("next year date to next year : "+years);
		
		LocalDate year=date.minus(5,ChronoUnit.YEARS);
		System.out.println("5 previous year date : "+year);
		
		LocalDate decades=date.plus(2,ChronoUnit.DECADES);
		System.out.println("20 years after today : "+decades);
		
		
		LocalDate centuries=date.plus(2,ChronoUnit.CENTURIES);
		System.out.println("20 years after today : "+centuries);
	}
	public static void CheckingAdjusters() {
		
		LocalDate date=LocalDate.now();
		
		LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("first day of next month is : "+dayOfNextMonth);
		
		LocalDate dayOfMonth=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("first day of prasent month is : "+dayOfMonth);
		
		LocalDate nextSaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("next Saturday is : "+nextSaturday);
		
		LocalDate lastDate=date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("last date of the month is : "+lastDate);
		
		LocalDate lastFriday=date.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
		System.out.println("last friday in the month is : "+lastFriday);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateAndTime();
		ZonedDateAndTime();
		CheckingPeriodAndDuration();
		CheckingChronoUnit();
		CheckingAdjusters();
	}

}