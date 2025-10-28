package com.BasicRecursion;

import java.util.Scanner;

public class Three_Nto1 {
	static void rec(int n) {
		if(n<1) {
			return;
		}
		System.out.println(n--);
		rec(n);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n : ");
	int n = sc.nextInt();
	rec(n);
	
}
}
