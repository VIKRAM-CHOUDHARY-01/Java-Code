package com.Java8.features;

import java.util.function.BiPredicate;

public class BiPredicateBasic {
public static void main(String[] args) {
	BiPredicate<Integer, String> isLengthGreater = (length, text)->length>=text.length();
	System.out.println(isLengthGreater.test(5, "Hello World"));
}
}
