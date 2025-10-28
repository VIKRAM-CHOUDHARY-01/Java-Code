package com.BasicRecursion;

import java.util.Scanner;

public class Seven_Factorial {
	static int factorial(int n) {
		if(n<1) {
			return 1;
		}
		return factorial(n-1)*n;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to get its factorial : ");
	int n = sc.nextInt();
	int fact = factorial(n);
	System.out.println(fact);
}
}
