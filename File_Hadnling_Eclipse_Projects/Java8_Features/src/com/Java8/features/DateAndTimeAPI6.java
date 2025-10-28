package com.Java8.features;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DateAndTimeAPI6 {
public static void main(String[] args) {
	Instant start = Instant.now();
	for(int i =0;i<1000000000;i++) {
		int sum = 0;
		sum +=i+10;
	}
	Instant end = Instant.now();
	Duration d = Duration.between(start, end);
	Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
	System.out.println(d);
	System.out.println(d2);
	System.out.println(d.compareTo(d2));
}
}
