package com.BasicSortings;

import java.util.ArrayList;

public class MergeSort {
	// Merge Sort
	static void MergeSorting(int arr[], int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;

		MergeSorting(arr, low, mid);
		MergeSorting(arr, mid + 1, high);
		Merge(arr, low, high, mid);
	}

	static void Merge(int arr[], int low, int high, int mid) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i-low);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 8, 7, 6, 5, 4, 3, 2, 1 };
		MergeSorting(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
