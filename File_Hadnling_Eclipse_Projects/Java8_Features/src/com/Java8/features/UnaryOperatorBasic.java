package com.Java8.features;

import java.util.function.UnaryOperator;

public class UnaryOperatorBasic {
public static void main(String[] args) {
	UnaryOperator<String> op = (text)->text.toUpperCase();
	System.out.println(op.apply("vikram"));
}
}
