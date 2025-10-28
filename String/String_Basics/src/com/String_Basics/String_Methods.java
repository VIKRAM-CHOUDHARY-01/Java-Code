package com.String_Basics;

public class String_Methods {

	public static void main(String[] args) {
		
		//Write a program to reverse a String, using pre defined methods
		
		//Approach 1
		String s2 = "Vikram";
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		System.out.println(sb);
		
		//Approach 2
		
		String s3 = "Nice";
		StringBuffer sb1 = new StringBuffer(s3);
		sb1.reverse();
		System.out.println(sb1);
		
		//Appraoch 3
		
		String s4 = "Abhishek";
		char [] ch = s4.toCharArray();
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//Approach 4
		
		String str = "Prasoon";
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		//Q.2 Write a java program to remove the duplicates in string
		
		String str1 = "Programming";
		//Approach 1
		System.out.println("\n-------------------------------------------------------------\n");
		String ans = "";
		boolean flag = false;
		for(int i = 0;i<str1.length();i++) {
			flag = false;
			for(int j = i+1;j<str1.length();j++) {
				if(str1.charAt(i) == str1.charAt(j)){
					flag = true;
				}
			}
			if(flag!=true) {
				ans+=str1.charAt(i);
			}
			
		}
		System.out.println(ans);
		
		//Approach 2
		
		StringBuffer str3 =  new StringBuffer("Programming");
		for(int i = 0;i<str3.length();i++) {
			for(int j = i+1;j<str3.length();j++) {
				if(str3.charAt(i) == str3.charAt(j)) {
					str3.deleteCharAt(i);
				}
			}
		}
		System.out.println(str3);
		
		
		//Approach 3
		
		String s8 = "Programming";
		StringBuffer sb9 = new StringBuffer();
		for(int i = 0;i<s8.length();i++) {
			char ch1 = s8.charAt(i);
			int index = s8.indexOf(ch1, i+1);
			if(index==-1) {
				sb9.append(ch1);
			}
		}
		System.out.println(sb9);
		
		
	}

}
