package com.Java8.features;

import java.util.Arrays;
import java.util.List;

// Reference to instance method of arbitrary object
public class MethodRefBasic3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Vikram", "Roland");
		
		names.forEach(name -> System.out.println(name));
		
		System.out.println("-------------------------\n");
		
		names.forEach(System.out::println);
		
	}

}
