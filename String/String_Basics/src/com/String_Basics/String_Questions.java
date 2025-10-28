package com.String_Basics;

public class String_Questions {
public static void main(String[] args) {
	//Reverse a String
		String s = "Hello";
		String reversed = new StringBuilder(s).reverse().toString();
		System.out.println(reversed);
		
		//Creating string using char array
		
		char [] ch = {'v', 'i','k','r', 'a', 'm'};
		String s1 = new String(ch);
		System.out.println(s1);
		
		//toCharArray()
		
		char [] ch2 = s1.toCharArray();
		System.out.println(ch2[0]);
		
		
	
}
}
