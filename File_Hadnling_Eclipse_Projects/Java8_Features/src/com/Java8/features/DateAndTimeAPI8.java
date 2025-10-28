package com.Java8.features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPI8 {
public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	DateTimeFormatter dm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String formate = today.format(dm);
	System.out.println(formate);
	
	//Parsing :
	String date = "02/06/2023";
	DateTimeFormatter dm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate customDate = LocalDate.parse(date, dm2);
	System.out.println(customDate);
}
}
