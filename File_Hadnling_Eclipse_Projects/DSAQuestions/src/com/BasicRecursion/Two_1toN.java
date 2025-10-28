package com.BasicRecursion;

import java.util.Scanner;

public class Two_1toN {
	static void oneToN(int count, int n) {
		if(count > n) {
			return;
		}
		System.out.println(count++);
		oneToN(count,n);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n : ");
	int n = sc.nextInt();
	oneToN(1,n);
	
}
}
