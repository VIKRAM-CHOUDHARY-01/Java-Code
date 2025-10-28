package com.Java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasic4 {
public static void main(String[] args) {
	// max, min , count, collect - > these operations are called Terminal operations
	Integer max = Stream.iterate(0, n -> n+1).limit(101).max((a,b) -> a-b).get();
	System.out.println(max);
	
	Integer min = Stream.iterate(0, n -> n+1).limit(101).min((a,b)-> a-b).get();
	System.out.println(min);
	
	Long count = Stream.iterate(0, n->n+1).limit(101).count();
	System.out.println(count);
	
	
	List<String> names = Arrays.asList("java", "python", "ruby");
	
	names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
	
	//reduce
	
	Integer sum = Stream.iterate(1, n -> n+1).limit(5).reduce((a,b) -> a+b).get();
	
	System.out.println(sum);
}
}
