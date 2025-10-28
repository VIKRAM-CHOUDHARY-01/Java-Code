package com.Java8.features;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTimeAPI7 {
public static void main(String[] args) {
	LocalDate ld = LocalDate.now();
	LocalDate ld2 = LocalDate.of(2025, 8, 04);
	Period pd = Period.between(ld, ld2);
	System.out.println(pd);
}
}
