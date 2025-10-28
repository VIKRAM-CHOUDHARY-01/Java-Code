package com.Java8.features;

import java.time.LocalDate;
import java.time.Month;

public class DateAndTimeAPI {
public static void main(String[] args) {
	// there are 8 classes :
	//#1 LocalDate
	
	LocalDate today = LocalDate.now();
	System.out.println(today);
	
	LocalDate customDate = LocalDate.of(2023, 06, 2);
	System.out.println(customDate);
	
	Month month = today.getMonth();
	int day = today.getDayOfMonth();
	int year = today.getYear();
	System.out.println(day + "- " + month + "-" + year);
	
	LocalDate yesterday = today.minusDays(1);
	System.out.println(yesterday);
	if(today.isAfter(yesterday)) {
		System.out.println("Ha Bhai");
	}
	
}

}
