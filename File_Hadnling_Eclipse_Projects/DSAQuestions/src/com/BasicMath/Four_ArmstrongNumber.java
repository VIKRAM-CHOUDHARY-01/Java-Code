package com.BasicMath;

class Solution4 {
    public boolean isArmstrong(int n) {
        int temp  = n;
        int arm = 0;
        while(n>0){
            int rem = n%10;
            arm += rem*rem*rem;
            n = n /10;
        }
        if(arm==temp){
            return true;
        }else{
            return false;
        }
    }
}
public class Four_ArmstrongNumber {
public static void main(String[] args) {
	Solution4 s = new Solution4();
	System.out.println(s.isArmstrong(13));
}
}
