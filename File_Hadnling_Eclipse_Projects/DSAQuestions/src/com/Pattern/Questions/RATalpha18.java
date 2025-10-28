package com.Pattern.Questions;

public class RATalpha18 {
public static void main(String[] args) {

	char ch = 'E';
	for(int i =1;i<=5;i++) {
		for(int j =1;j<=i;j++) {
			
			System.out.print(ch++ + " ");
			
		}
		ch = 'E';
		ch = (char) (ch- i);
		
	
		
		System.out.println();
	}
}
}
