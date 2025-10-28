package com.BasicSortings;

public class BubbleSort {
public static void main(String[] args) {
	int nums[] = {8,7,6,2,5,5,4,3,2,1};
	int n = nums.length;
	
	for(int i = n-1;i>=0;i--) {
		boolean isSwapped = false;
		for(int j = 0;j<i;j++) {
			if(nums[j]>nums[j+1]) {
				int temp = nums[j];
				nums[j] =nums[j+1];
				nums[j+1] = temp;
				isSwapped = true;
			}
		}
		// no swap means array is sorted
		if(!isSwapped) {
			break;
		}
	}
	for(int i =0;i<nums.length;i++) {
		System.out.print(nums[i] + "\t");
	}
}
}
