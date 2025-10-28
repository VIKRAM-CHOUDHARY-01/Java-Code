package com.Pattern.Questions;

import java.util.*;
public class Prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number of rows : ");
	int row = sc.nextInt();
	int till = row;
	for(int i = 1;i<row;i++) {
		for(int j = 1;j<=i;j++) {
			till++;
		}
	}
	
	int arr[] = new int[till];
	
	int count = 0;
	for(int i = 1;i<Integer.MAX_VALUE;i++) {
		int div = 0;
		
		for(int j = 1;j<=i;j++) {
			if(i%j==0) {
				div++;
			}
		}
		if(div==2) {
			arr[count++] = i;
		}
		if(count==till) {
			break;
		}
	}
	int s = 0;
	for(int i =1;i<=row;i++) {
		for(int j = 1;j<=i;j++) {
			System.out.print(arr[s] + " ");
			s++;
		}
		System.out.println();
	}
}
}
