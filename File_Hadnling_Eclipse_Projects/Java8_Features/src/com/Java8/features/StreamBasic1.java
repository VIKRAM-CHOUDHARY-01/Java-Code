package com.Java8.features;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic1 {
	public static void main(String[] args) {
		
		//Imparative Appraoch
		int[]arr = {4,5,5,3,5,7,7,4,3,2,6,7,344,322,5,3,4,6};
		int sumOfEvenNumbers = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sumOfEvenNumbers+=arr[i];
			}
		}
		System.out.println("Sum of Even Numbers Using Imaprative Approach : " + sumOfEvenNumbers);
		
		//Decalarative Approach
		
		int sumOfEvenNumbers2 = Arrays.stream(arr).filter(n -> n%2==0).sum();
		System.out.println("Sum of Even Numbers Using Decalartive Appraoch : " + sumOfEvenNumbers2);
	    Stream.iterate(0, n -> n+1).limit(10).collect(Collectors.toList()).forEach(System.out::println);
	    System.out.println("----------------------\n");
		Stream.generate(()->(int)(Math.random()*100)).limit(3).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
