package com.Java8.features;

import java.util.function.Function;

public class FunctionInterfaceBasic {
public static void main(String[] args) {
	//Funtional method : apply
	Function<String, Integer> strLength = s-> s.length();
	System.out.println(strLength.apply("Hello"));
	
	//Built in methods of Function Interface : 1) andThen
	
	Function<String, String> strTrim = s -> s.trim();
	Function<String, Integer> strLength1 = s -> s.length();
	Function<String, Integer> strResult = strTrim.andThen(strLength1);
	System.out.println(strResult.apply("   hello  "));
	
	//Built in Method of Function Interface : 2) compose();
	
	Function<String, String> strUpper = s -> s.toUpperCase();
	Function<String, String> addPoint = s -> s + "!";
	Function <String, String> strWhole = addPoint.compose(strUpper);
	System.out.println(strWhole.apply("nice"));
	
	//Built in Method of Function interface : 3) identity();
	Function<String,String> h = Function.identity();
	System.out.println(h.apply("Hello"));
}

}
