package com.Java8.features;

import java.util.function.BiFunction;

public class BiFunctionBasic {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> add = (num1,num2)->num1 +num2;
	System.out.println(add.apply(10, 5));
}
}
