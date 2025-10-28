package com.Java8.features;

import java.util.function.BiConsumer;

public class BiConsumerBasic {
public static void main(String[] args) {
	BiConsumer<Integer, String> intro = (age,name)->System.out.println("Hello My Name is " + name + " and my age is : " + age);
	intro.accept(21, "Vikram");
}
}
