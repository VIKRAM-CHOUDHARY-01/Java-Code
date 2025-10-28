package com.BasicMath;

class Solution2 {
    public boolean isPalindrome(int x) {
      int temp = x;
      int pali = 0;
      int rem = 0;
      while(temp >0){
        rem = temp%10;
        pali = (pali*10)+rem;
        temp = temp/10;
      }
      if(pali==x){
        return true;
      }else{
        return false;
      }
    }
}
public class Three_Palindrome {
public static void main(String[] args) {
	Solution2 obj =  new Solution2();
	System.out.println(obj.isPalindrome(111));
	
}
}
