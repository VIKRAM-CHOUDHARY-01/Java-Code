package com.Java8.features;

import java.time.LocalTime;

public class DateAndTimeAPI2 {
public static void main(String[] args) {
	//#2
	LocalTime timeNow = LocalTime.now();
	System.out.println(timeNow);
	
	LocalTime customTime = LocalTime.of(4, 03);
	System.out.println(customTime);
	
	System.out.println(timeNow.getHour());
	System.out.println(timeNow.getSecond());
	
	LocalTime parsed = LocalTime.parse("12:02");
	System.out.println(parsed);
	
}
}
