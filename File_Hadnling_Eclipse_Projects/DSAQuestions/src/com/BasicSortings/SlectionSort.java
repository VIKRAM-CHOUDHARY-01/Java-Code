package com.BasicSortings;

public class SlectionSort {
public static void main(String[] args) {
	int arr[] = {7,6,5,3,2,5,10,1,10,45,34};
	int n = arr.length;
	for(int i = 0;i<n-1;i++) {
		int min = i;
		for(int j = i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
			min = j;
			}
		}
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}
		for(int i =0;i<n;i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}

