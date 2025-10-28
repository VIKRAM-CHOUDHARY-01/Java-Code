package com.Java8.features;
//Reference to instance method

import java.util.function.Supplier;

class InstanceRef{
	public String greet() {
		return"Hello";
	}
}

public class MethodRefBasic {
public static void main(String[] args) {
	InstanceRef obj = new InstanceRef();
	//Lambda
	Supplier<String> sup = ()->obj.greet();
	
	
	//Reference to instance method
	
	Supplier<String> sup2 = obj::greet;
	System.out.println(sup2.get());
}
}
