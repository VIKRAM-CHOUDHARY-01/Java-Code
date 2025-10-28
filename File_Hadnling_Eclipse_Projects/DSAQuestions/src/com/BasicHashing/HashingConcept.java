package com.BasicHashing;

import java.util.HashMap;

public class HashingConcept {
public static void main(String[] args) {
	
	//basic hashing concept if -> array elements are equal or lesser then its size.
	int arr[] = {1,3,4,1,1,2,2,4,3,4,3};
	int []hash = new int[arr.length+1];
	for(int i = 0;i<arr.length;i++) {
		hash[arr[i]]+=1;
	}
	System.out.println("Array Integer Hashing Answer : ");
	for(int i =0;i<hash.length;i++) {
		if(hash[i]!=0) {
			System.out.print(hash[i] + "\t");
		}
	}
	System.out.println("\n------------------");
	
	//character hashing
	System.out.println("Array charcter hashing answer : ");
	String s = "avnbbababc";
	int hash2[] = new int[26];
	for(int i =0;i<s.length();i++) {
		int a = s.charAt(i)-'a';
		hash2[a]+=1;
		
	}
	
	for(int i =0;i<hash2.length;i++) {
		if(hash2[i]!=0) {
			
			System.out.print(hash2[i] + "\t");
		}
	}
	
	// integer hashing with HashMap
	System.out.println("\n---------------");
	HashMap<Integer,Integer> mapAns = new HashMap<>();
	System.out.println("Hashing with Map : ");
	int count = 0;
	for(int i = 0;i<arr.length;i++) {
		mapAns.put(arr[i], mapAns.getOrDefault(arr[i], 0)+1);
	}
	
	System.out.println(mapAns);
	System.out.println("\n---------------");
	
	//character hashing with hashMap
	System.out.println("Chracter Hashing with HashMap: ");
	HashMap<Character, Integer>  charHash = new HashMap<>();
	for(int i =0;i<s.length();i++) {
		charHash.put(s.charAt(i), charHash.getOrDefault(s.charAt(i), 0)+1);
	}
	System.out.println(charHash);
	
}
}

