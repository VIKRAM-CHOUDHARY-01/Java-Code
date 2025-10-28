package com.Java8.features;

import java.util.function.Predicate;

class Student{
	private String name;
	private int id;
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
public class PredicateBasic {
public static void main(String[] args) {
	Predicate<Integer> isEven = (n)->n%2==0;
	System.out.println(isEven.test(8));
	
	Predicate<String> isStartWithA = (s)->s.startsWith("A");
	System.out.println(isStartWithA.test("Apple"));
	
	
	// Default Method - 1) and
	Predicate<String> isEndWithU = (s)->s.charAt(s.length()-1)=='u';
	Predicate<String> isBoth = isStartWithA.and(isEndWithU);
	System.out.println(isBoth.test("Superu"));
	System.out.println(isBoth.test("Aeroplanu"));
	
	// 2) or
	Predicate<String> isAtlestOne = isStartWithA.or(isEndWithU);
	System.out.println(isAtlestOne.test("Vikru"));
	
	//3 ) negate
	System.out.println(isStartWithA.negate().test("Apple")); // false
	
	// Predicate has one static method -> isEqual 
	
	Student st1 = new Student("Vikram", 1);
	Student st2 = new Student("Ravi", 2);
	Predicate<Student> studentPredicate =(x)->x.getId()>=2;
	System.out.println(studentPredicate.test(st2));
	
	
	Predicate<String> pt = Predicate.isEqual("Hello");
	
	System.out.println(pt.test("Nice"));
	System.out.println(pt.test("Hello"));
	
}
}
