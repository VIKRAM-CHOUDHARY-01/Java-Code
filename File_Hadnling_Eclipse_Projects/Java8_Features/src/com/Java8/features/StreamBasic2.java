package com.Java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic2 {
public static void main(String[] args) {
	//Ways to Create Stream :
	//#1
	
	List<Integer> list = Arrays.asList(1,2,3,5);
	Stream<Integer> st = list.stream();
	
	//#2
	int arr[] = {1,3,7,89};
	IntStream st2 = Arrays.stream(arr);
	
	//#3
	
	Stream<String> st3 = Stream.of("Hello", "By", "Nice");
	
	//#4
	
	Stream<Integer> st4 = Stream.iterate(0, n -> n+1).limit(100);
	
	//#5
	
	Stream<Integer> st5 = Stream.generate(()-> (int)Math.random()*100).limit(5);
}
}
