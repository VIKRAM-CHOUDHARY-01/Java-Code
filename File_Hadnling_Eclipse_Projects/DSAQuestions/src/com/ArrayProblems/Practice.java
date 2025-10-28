package com.ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	// Sorting Practice
	// 1) Selection Sort
	public static void selectionSort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[temp]) {
					temp = j;
				}
			}
			int temp2 = arr[i];
			arr[i] = arr[temp];
			arr[temp] = temp2;

		}
	}

	// 2) Bubble Sort

	public static void bubbleSort(int arr[]) {
		for(int i = arr.length-1;i>0;i--) {
			boolean flag = false;
			for(int j = 0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag =true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}
	
	
	// 3) Insertion Sort
	public static void InsertionSort(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			int j = i;
			while(j>0 && (arr[j]<arr[j-1])) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
	}
	
	//4)Merge Sort
	public static void mergeSort(int arr[], int low, int high) {
		if(low>=high) {
			return;
		}
		int partiationIndex = (low+high)/2;
		mergeSort(arr, low, partiationIndex);
		mergeSort(arr, partiationIndex+1 , high);
		merge(arr, low, high, partiationIndex);
	}
	public static void merge(int arr[], int low, int high, int partiation) {
		int left = low;
		int right = partiation+1;
		List<Integer> list = new ArrayList<>();
		while(left<=partiation && right<=high) {
			if(arr[left]<arr[right]) {
				list.add(arr[left]);
				left++;
			}else {
				list.add(arr[right]);
				right++;
			}
		}
		while(left<=partiation) {
			list.add(arr[left]);
			left++;
		}
		while(right<=high) {
			list.add(arr[right]);
			right++;
		}
		for(int i = low;i<=high;i++) {
			arr[i] = list.get(i-low);
		}
	}
	
	
	//5) QuickSort
	
	public static void QuickSort(int arr[], int low, int high) {
		if(low<=high) {
			int pivotIndex = qs(arr, low, high);
			QuickSort(arr, low, pivotIndex-1);
			QuickSort(arr, pivotIndex+1, high);
		}
	}
	
	public static int qs(int arr[], int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i<j) {
			while(arr[i]<=pivot && i<high) {
				i++;
			}
			while(arr[j]>pivot && j>low) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j;
	}
	
	
	public static void QuickSort2(int arr[], int low, int high) {
		if(low<=high) {
			int piviotIndex = Qs2(arr, low,high);
			QuickSort2(arr, low,piviotIndex-1);
			QuickSort2(arr, piviotIndex+1, high);
		}
	}
	public static int Qs2(int arr[], int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i<j) {
			while(arr[i]<=pivot && i<high) {
				i++;
			}
			while(arr[j]>pivot && j>low) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[low];
		arr[low]=temp;
		return j;
		
	}
	

	public static void main(String[] args) {

		int arr[] = { 9, 8, 8, 7, 6, 5, 5, 4, 3, 2, 1 };
		//	selectionSort(arr);
       //   bubbleSort(arr);
      //    InsertionSort(arr);
     //     mergeSort(arr, 0, arr.length-1);
		
			QuickSort2(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");

		}
	}
}
