package com.Pattern.Questions;

public class RATFullNumber12 {
public static void main(String[] args) {
	for(int i =1;i<=4;i++) {
		for(int j = 1;j<=i;j++) {
			System.out.print(j);
		}
		for(int k = 3;k>=i;k--) {
			System.out.print(" ");
		}
		for(int m = 3; m>=i;m--) {
			System.out.print(" ");
		}
		for(int l = i;l>=1;l--) {
			System.out.print(l);
		}
		
		System.out.println();
	}
	
}
}
