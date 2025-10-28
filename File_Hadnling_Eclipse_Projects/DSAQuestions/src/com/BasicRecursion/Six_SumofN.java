package com.BasicRecursion;

import java.util.Scanner;

public class Six_SumofN {
	static int sumOfN(int n) {
		if(n<1) {
			return 0;
		}
		return sumOfN(n-1) + n;
	}
public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
	System.out.println("Enter n : ");
	int n = sc.nextInt();
	int ans = sumOfN(n);
	System.out.println("Sum : " + ans);
}
}
