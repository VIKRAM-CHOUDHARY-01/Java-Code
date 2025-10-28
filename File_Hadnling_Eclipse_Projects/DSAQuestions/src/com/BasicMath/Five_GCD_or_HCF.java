package com.BasicMath;

import java.util.ArrayList;

class Solution5{
	int hcf(int n1, int n2) {
		
//		int max = 0;
//		int limit = n1>n2?n2:n1;
//		for(int i =1;i<=limit;i++) {
//			if(n1%i==0 && n2%i==0) {
//				if(i>max) {
//					
//					max = i;
//				}
//			}
//		}
//		return max;
		
		//better approach
		
		while(n2!=0) {
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		}
		return n1;
	}
}
public class Five_GCD_or_HCF {
public static void main(String[] args) {
	Solution5 s = new Solution5();
	System.out.println(s.hcf(10,15));
}
}
