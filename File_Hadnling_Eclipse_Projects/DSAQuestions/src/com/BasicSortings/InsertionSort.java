package com.BasicSortings;

public class InsertionSort {
public static void main(String[] args) {
	int arr[] = {7,8,6,5,4,3,2,1};
	int n = arr.length;
	for(int i = 0;i<n;i++) {
		int j = i;
		while(j>0 && arr[j]<arr[j-1]) {
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
			j--;
		}
	}
	for(int i =0;i<n;i++) {
		System.out.print(arr[i] + "\t");
	}
}
}
