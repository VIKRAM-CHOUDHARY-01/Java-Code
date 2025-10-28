package com.BasicSortings;

public class QuickSortRevisio {
	public static void QuickSort(int arr[], int low, int high) {
		if(low<high) {
			int piviotIndex = Qs(arr, low, high);
			QuickSort(arr,low, piviotIndex-1);
			QuickSort(arr,piviotIndex+1,high);
		}
	}
	public static int Qs(int arr[], int low, int high) {
		int piviot = arr[low];
		int i =low;
		int j = high;
		while(i<=j) {
			while(i<=high && arr[i]<=piviot) {
				i++;
			}
			while(j>=low && arr[j]>piviot) {
				j--;
			}
			
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low]= arr[j];
		arr[j] = temp;
		return j;
	}
	public static void main(String[] args) {
		int arr[] = {7,65,4,4,3,3,2,21};
		QuickSort(arr,0, arr.length-1);
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}