package com.BasicRecursion;

import java.util.Scanner;

public class Four_1toN_Backtraking {
	static void byBacktracking(int n) {
		
		if(n<1) {
			return;
		}
	
		byBacktracking(n-1);
		System.out.println(n);
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n : ");
	int n= sc.nextInt();
	byBacktracking(n);
}
}
