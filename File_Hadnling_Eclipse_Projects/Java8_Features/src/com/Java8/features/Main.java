package com.Java8.features;

@FunctionalInterface
interface Space {
	int spaceCount(String s);
}

public class Main {
	public static void main(String[] args) {

		Space obj = (s) -> {
			int result = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') {
					result++;
				}
			}
			return result;
		};

		System.out.println(obj.spaceCount("vi k r"));

	}
}
