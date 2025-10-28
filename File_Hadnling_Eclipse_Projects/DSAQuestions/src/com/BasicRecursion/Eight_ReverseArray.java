	package com.BasicRecursion;
	
	public class Eight_ReverseArray {
		//recursion using two pointers
		static void reverse(int arr[], int start, int end) {
			if(start>end) {
				return;
			}
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverse(arr, start+1, end-1);
		}
		
		//Recursive Helper Method (Without Pointers)
		
		static void reverse2(int arr[], int index) {
			if(index >= arr.length/2) {
				return;
			}
			
		     int temp = arr[index];
		     arr[index] = arr[arr.length - 1 - index];
		     arr[arr.length - 1 - index] = temp;
		     reverse2(arr, index + 1);
		}
		
		// with array length
		
		static void reverse3(int arr[], int n) {
			if(n<=arr.length/2) {
				return;
			}
			int temp = arr[n-1];
			arr[n-1] = arr[arr.length-n];
			arr[arr.length-n] = temp;
			
			reverse3(arr, n-1);
		}
		public static void main(String[] args) {
	
			// Q Given an array arr of n elements. The task is to reverse the given array.
			// The reversal of array should be inplace.
			
			int arr[] = {1,2,3,4,5};
//			reverse(arr, 0, arr.length-1);
			
//			reverse2(arr, 0);
			
			reverse3(arr, arr.length);
			for(int i =0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		
	
		}
	}
