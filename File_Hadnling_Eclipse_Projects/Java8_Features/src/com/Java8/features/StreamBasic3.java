package com.Java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic3 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 3, 5, 674, 3, 6, 5, 4, 6, 8, 34, 2, 6, 8, 9, 77, 6, 5, 67);

		List<Integer> evenList = li.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		List<Integer> mappedList = evenList.stream().map(n -> n / 2).collect(Collectors.toList());
		System.out.println(mappedList);

		List<Integer> distinctAndSortedList = mappedList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(distinctAndSortedList);

		List<Integer> reversedList = distinctAndSortedList.stream().sorted((a, b) -> b - a)
				.collect(Collectors.toList());
		System.out.println(reversedList);

		List<Integer> limitedAndSkippedList = reversedList.stream().skip(2).limit(3).collect(Collectors.toList());
		System.out.println(limitedAndSkippedList);

		// New List

		List<Integer> newList = Stream.iterate(0, n -> n + 1).limit(101).skip(1).filter(n -> n % 2 == 0)
				.map(x -> x / 10).distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());
		System.out.println(newList);
	}
}
