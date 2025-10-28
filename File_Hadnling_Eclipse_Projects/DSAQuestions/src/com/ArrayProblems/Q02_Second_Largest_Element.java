package com.ArrayProblems;

import java.util.Arrays;

public class Q02_Second_Largest_Element {
	//Brute Force
	public static int secondMax(int []arr) {
		Arrays.sort(arr);
		int max = arr[arr.length-1];
		for(int i =arr.length-1;i>=1;i--) {
			if(arr[i]!=arr[i-1]) {
				max = arr[i-1];
				break;
			}
		}
		return max;
	}
	
	//Optimal Approach
	public static int secondLargestOptimal(int arr[]) {
		int max = arr[0];
		int max2 = arr[1]; 
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max2 && arr[i]<max) {
				max2 = arr[i];
			}
		}
		
		return max2;
	}
	
	
public static void main(String[] args) {
	int arr[] = {11,12,23,44,55,46,27,8};
//	System.out.println("Second Largest Element : " + secondMax(arr));
	System.out.println("Second Largest Element :" + secondLargestOptimal(arr));
	
}
}
