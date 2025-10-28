package com.ArrayProblems;

import java.util.Arrays;
import java.util.List;

public class Q01_Largest_Element {
public static void main(String[] args) {
	int arr[] = {13,4,5,67,5,4,3,7,8,4,35,6,3,2334,5,6,54};
	//brute force
	Arrays.sort(arr);
	System.out.println("The Max Element is : " + arr[arr.length-1]);
	
	//optimal way
	int max = arr[0];
	for(int i =0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	System.out.println("The Max Element is : " + max);
}
}
