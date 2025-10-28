package com.enums;

public class Enums_Basics {
	enum Level {
			LOW,
			MEDIUM,
			HIGH
	};
	
	enum WEEKDAYS{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURDAY,
		FRIDAY,
		SATURDAY,
	}
	enum Colors {
		RED,
		WHITE,
		BLACK,
		BROWN,
		YELLOW
	}

public static void main(String[] args) {
	
	System.out.println(Level.LOW);
	System.out.println("-------------------------------");
	for(Level l : Level.values()) {
		System.out.println(l);
	}
	System.out.println("----------------------------------------");
	for(WEEKDAYS W : WEEKDAYS.values()) {
		System.out.println(W);
		
	}
	System.out.println("----------------------------------------");
	for(Colors c : Colors.values()) {
		System.out.println(c);
	}
}
	
}
