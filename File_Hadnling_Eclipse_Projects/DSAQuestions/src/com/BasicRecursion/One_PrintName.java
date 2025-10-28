package com.BasicRecursion;

public class One_PrintName {
	static void printName(int count) {
	
		if(count==5) {
			return;
		}
		System.out.println("Vikram");
		count++;
		printName(count);
	}
public static void main(String[] args) {
	printName(0);
}
}
