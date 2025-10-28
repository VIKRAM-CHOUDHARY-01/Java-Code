package com.BasicMath;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution6 {
 public void divisors(int n) {
     ArrayList<Integer> arr = new ArrayList<>();
     for(int i =1;i<=n;i++){
         if(n%i==0){
             arr.add(i);
         }
     }
   System.out.println(arr);
   
   // 2nd Optimized Way
   List<Integer> li = new ArrayList<>();
   	for(int i =1;i<=Math.sqrt(n);i++) {
   		if(n%i==0) {
   			li.add(i);
   			if(n/i!=i) {
   				li.add(n/i);
   			}
   		}
   	}
   	Collections.sort(li);
   	System.out.println(li);
    
 }
}

public class Six_AllDivisors {
	 public static void main(String[] args) {
	     Solution6 s = new Solution6();
	    
	     s.divisors(15);
	 }
	}
