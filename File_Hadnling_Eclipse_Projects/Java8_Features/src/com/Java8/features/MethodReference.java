package com.Java8.features;

import java.util.function.BiFunction;

//static method reference
class StaticRef{
	
	public static int multiply(int a, int b) {
		return a*b;
	}
}
public class MethodReference {
public static void main(String[] args) {
	//Lambda
	BiFunction<Integer, Integer, Integer> obj = (a,b)->StaticRef.multiply(a,b);
	
	//Static Method Reference
	BiFunction<Integer,Integer,Integer> obj2 =StaticRef::multiply;
	System.out.println(obj2.apply(2, 10));
	
	
	

}
}
