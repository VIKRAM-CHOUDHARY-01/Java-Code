//Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem;
        int pali = 0;
        while(x>0){
            rem = x%10;
            pali = (pali*10) + rem;
            x = x/10;
        }
        if(temp == pali){
            return true;
        }else{
            return false;
        }
    }
}