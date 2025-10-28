package com.BasicRecursion;


class Main {
    public static void main(String[] args) {
        Solution22 obj = new Solution22();
        
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
class Solution22 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>= 'a' && s.charAt(i)<='z'){
                s1.append(s.charAt(i)) ;          }
        }
       
        StringBuilder s2 = new StringBuilder();
        int left = 0;
        int right = s1.length()-1;
        while(left<right) {
        	if(s1.charAt(left)!=s1.charAt(right)) {
        		return false;
        	}
        	left++;
        	right--;
        }
        
        return true;
    }
}
