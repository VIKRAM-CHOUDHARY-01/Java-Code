package com.Java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution{
	public static  void neg(int arr[]) {
		int av[] = new int[arr.length];
		int count = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) {
				av[count++] = arr[i];
				
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<0) {
				av[count++] = arr[i];
				
			}
		}
		for(int i =0;i<av.length;i++) {
			System.out.print
			(av[i] + "\t");
			
		}
	}
}

public class StreamQuestion2 {
public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1,45,11,32,55,45,123,14);
	List<String> withOne = li.stream().map(n -> n.toString()).filter(n -> n.startsWith("1")).collect(Collectors.toList());
	System.out.println(withOne);
	
	int arr[] = {3,-2,-5,10,1,-15};
	Solution.neg(arr);
	System.out.println();
	List<Integer> ans = li.stream().map(n -> n.toString()).filter(n -> n.charAt(0)=='1').map(n -> Integer.parseInt(n)).collect(Collectors.toList());
	System.out.println(ans);
	
			
	
}
}
