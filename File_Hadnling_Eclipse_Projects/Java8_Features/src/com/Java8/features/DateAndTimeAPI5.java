package com.Java8.features;

import java.time.Instant;

public class DateAndTimeAPI5 {
public static void main(String[] args) {
	long current = System.currentTimeMillis();
	System.out.println(current);
	Instant it = Instant.now();
	System.out.println(it);
}
}
