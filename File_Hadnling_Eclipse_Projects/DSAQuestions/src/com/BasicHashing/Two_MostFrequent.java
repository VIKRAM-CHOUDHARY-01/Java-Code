package com.BasicHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Leetcode : 1838 -> Please look back after some time. since there it is litle bit different
public class Two_MostFrequent {
public static void main(String[] args) {
	Solution3 s2 = new Solution3();
	
	System.out.println(s2.mostFrequentElement(new int[]{1,3,4,3,2,1,3,4,3,2,3,32,1,1,12,3,4,4,3,3,}));
	
}

}
class Solution3{
	public int mostFrequentElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		int freq = 0;
		int result = Integer.MAX_VALUE;
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if(freq<value || (freq==value && result>key)) {
				freq = value;
				result = key;
			}
		}
		return result;
		
	}
}