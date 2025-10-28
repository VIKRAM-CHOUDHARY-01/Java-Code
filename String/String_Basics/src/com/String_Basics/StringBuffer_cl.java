package com.String_Basics;

public class StringBuffer_cl {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity()); // 16(default) + 5(Hello) => 21
		System.out.println(sb.charAt(0));
		sb.append(" Nice Guy");
		System.out.println(sb);
		sb.insert(0, "Hey");
		System.out.println(sb);
		sb.delete(4, 8);
		System.out.println(sb);
		
	}
}
