package com.BasicMath;


class Solution7{
	public boolean isPrime(int n) {
//		int count =0;
//		for(int i =1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//			if(count>2) {
//				return false;
//			}
//		}
//		return true;
		
		//Better Approach
		int count = 0;
		// i*i<=n
		for(int i =2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			} 
		}
		return true;
	}
}
public class Seven_PrimeNumbers {
public static void main(String[] args) {
	Solution7 s = new Solution7();
	System.out.println(s.isPrime(17));
}
}
