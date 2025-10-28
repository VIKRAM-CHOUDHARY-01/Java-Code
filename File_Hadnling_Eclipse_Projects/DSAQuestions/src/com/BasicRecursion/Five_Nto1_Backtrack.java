package com.BasicRecursion;

import java.util.Scanner;

public class Five_Nto1_Backtrack {
	static void byBacktrackCount(int count,int n) {
		if(n<count) {
			return;
		}
		byBacktrackCount(count+1, n);
		System.out.println(count);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n : ");
	int n = sc.nextInt();
	 byBacktrackCount(1, n);
}
}
