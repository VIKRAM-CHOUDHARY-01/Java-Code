package com.Pattern.Questions;

public class TriangleAlpha17 {
public static void main(String[] args) {
	for(int i =1;i<=4;i++) {
		char ch = 'A';
		char ch2 = 'C';
		for(int j =4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k = 1;k<=i;k++) {
			System.out.print(ch);
			ch++;
		}
		for(int m = 1;m<i;m++) {
			System.out.print(ch2--);
		}
		System.out.println();
	}
}
}
