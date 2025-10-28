package com.mis.topics;

enum COLOURS{
	RED,
	BLACK,
	BROWN,
	YELLOW,
	WHITE
}
public class TestQ3 {
public static void main(String[] args) {
	System.out.println(COLOURS.BROWN);
	for(COLOURS c : COLOURS.values()) {
		System.out.println(c);
	}
}
}
