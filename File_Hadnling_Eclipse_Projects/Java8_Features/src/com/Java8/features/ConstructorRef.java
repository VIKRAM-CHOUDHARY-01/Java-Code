package com.Java8.features;

import java.util.function.Supplier;

//Constructor Reference
class User{
	User(){
		System.out.println("Hello from Constructor");
		
	}
}
public class ConstructorRef {
public static void main(String[] args) {
	Supplier<User> sup = ()->new User();
	
	//Constructor Reference
	Supplier<User> sup2 = User::new;
	sup2.get();
	
	
	
}
}
