package com.BasicMath;

class Solution {
    public int reverse(int x) {
        int num =  x>0 ? x : -(x);    
        int ans = 0;
        int rem = 0;
        while(num>0){
            rem = num%10;
            // Overflow check
            if (ans > (Integer.MAX_VALUE - num) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }
            ans = (ans*10)+rem;
            num = num/10; 
        }
        return x>0 ? ans : -ans;
    }
}

public class Two_ReverseNumber{
	public static void main(String[]args) {
		Solution s = new Solution();
		System.out.println(s.reverse(432));
		
	}
}
