package com.Java8.features;

interface A1{
	public static void nice() {
		System.out.println("Nice");
	}
}
public class staticMethodInInterface {
public static void main(String[] args) {
	A1.nice();
}
}
