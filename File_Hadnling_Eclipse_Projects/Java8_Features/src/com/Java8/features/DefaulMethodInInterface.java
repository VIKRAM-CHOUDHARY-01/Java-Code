package com.Java8.features;

interface A{
	default void sayHello() {
		System.out.println("Hii Guys");
	}
}
class B implements A{
	public void nice() {
		A.super.sayHello();
	}
}
public class DefaulMethodInInterface  {
public static void main(String[] args) {
	B obj = new B();
	obj.nice();
	
}
}
