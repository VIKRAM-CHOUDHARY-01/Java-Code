package com.MultiThreading;

class Person{
	private String name;
	private int age;
	//Regular Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Copy Constructor
	
	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class Copy_Constructor {
	public static void main(String[] args) {
		Person original = new Person("Vikram", 21);
		Person copy = new Person(original);
		System.out.println(original.getName());
		System.out.println(copy.getName());
		original.setName("Roland");
		System.out.println(original.getName());
		System.out.println(copy.getName());
	}

}
