package com.BasicRecursion;

public class tenth_fibanachiNumber {
	
	 static int fib(int n) {
	       if(n==0){
	        return 0;
	       }else if(n==1){
	        return 1;
	       }
	       
	       return fib(n-1) + fib(n-2);
	       
	        
	    }
public static void main(String[] args) {
	System.out.println(fib(2));
}
}


//leetcode
//class Solution {
//    public int fib(int n) {
//        if(n==0){
//            return 0;
//        }else if(n==1){
//            return 1;
//        }
//            int n1 = 0;
//            int n2 = 1;
//            int n3=0;
//            for(int i =1;i<n;i++){
//                n3 = n1 +n2;
//                n1 = n2;
//                n2 = n3;
//            }
//            return n3;
//        
//    }
//}