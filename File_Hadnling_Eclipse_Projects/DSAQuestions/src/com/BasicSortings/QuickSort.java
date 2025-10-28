package com.BasicSortings;

public class QuickSort {
	public static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int partitionIndex = pivotFinder(arr, low, high);
			quickSort(arr, low, partitionIndex-1);
			quickSort(arr, partitionIndex+1, high);
		}
	}
	public static int pivotFinder(int arr[], int low, int high) {
		int pivot = low;
		int i = low;
		int j = high;
		while(i<j) {
			while(arr[i]<=arr[pivot] && i<=high-1) {
				i++;
			}
			while(arr[j]>arr[pivot] && j>=low+1) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
			}
		}
		int temp = arr[pivot];
		arr[pivot] = arr[j];
		arr[j]= temp;
		
		return j;
		
		
	}
public static void main(String[] args) {
	int arr[] = {8,7,6,5,4,3,2,1};
	quickSort(arr,0, arr.length-1);
	for(int i =0;i<arr.length;i++) {
		System.out.print(arr[i] + "\t");
	}
}
}
