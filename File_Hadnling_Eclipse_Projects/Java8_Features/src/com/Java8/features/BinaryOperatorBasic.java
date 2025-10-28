package com.Java8.features;

import java.util.function.BinaryOperator;

public class BinaryOperatorBasic {
	public static void main(String[] args) {
		BinaryOperator<String> longerString = (text1, text2)-> text1.length()>text2.length()?text1:text2;
		System.out.println(longerString.apply("vikram", "vikram choudhary"));
	}

}
