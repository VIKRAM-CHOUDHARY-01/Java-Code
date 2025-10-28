package com.Java8.features;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateAndTimeAPI4 {
public static void main(String[] args) {
	ZonedDateTime zdt = ZonedDateTime.now();
	System.out.println(zdt);
	Set<String> zoneId = ZoneId.getAvailableZoneIds();
	zoneId.forEach(System.out::println);
	
}
}
