package com.BasicHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class One_FrequencyEle {
public static void main(String[] args) {
	Solution s1 = new Solution();
	int[]a = {1,2,3,4,5,6,2,1,1,1,4,4,3,2,3,3,4,5};
	s1.countFrequencies(a);
}
}


class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
    	HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        
        for(int i =0;i<nums.length;i++) {
        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			List<Integer> pair = new ArrayList<>();
			pair.add(entry.getKey());
			pair.add(entry.getValue());
			ans.add(pair);
		}  
        System.out.println(ans);
        return ans;
    }
}