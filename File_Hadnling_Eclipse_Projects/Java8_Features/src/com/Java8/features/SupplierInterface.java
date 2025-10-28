package com.Java8.features;
import java.util.function.Supplier;

public class SupplierInterface {
public static void main(String[] args) {
	// Supplier has only one method : T get();
	
	Supplier<Integer> sup = ()-> (int)(Math.random()*100);
	System.out.println(sup.get());
}
}
