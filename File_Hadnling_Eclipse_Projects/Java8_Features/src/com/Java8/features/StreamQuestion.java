package com.Java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion {
public static void main(String[] args) {
	
	//Even Number for an Integer list
	List<Integer> allNum = Arrays.asList(1,2,43,5,67);
	List<Integer> evenNum = allNum.stream().filter((n)-> n%2==0).collect(Collectors.toList());
	System.out.println(evenNum);
}
}
