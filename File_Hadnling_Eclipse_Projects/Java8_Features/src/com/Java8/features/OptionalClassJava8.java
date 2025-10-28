package com.Java8.features;

import java.util.NoSuchElementException;
import java.util.Optional;

class Students1{
	public String getName() {
		//Simulating of getting name from database
		return "Ram";
		//return null; -> will give nullPointerException
	}
	
	public Optional<String> getEmail(){
//		return Optional.of("vcisbest@gmail.com");
//		return Optional.ofNullable(null);
		// or
		
		return Optional.empty();
	}
}
public class OptionalClassJava8 {
	
public static void main(String[] args) {
		
	Students1 st1 = new Students1();
	System.out.println(st1.getName().toUpperCase());
	
	Optional<String> email = st1.getEmail();
	
	if(email.isPresent()) {
		System.out.println(email.get());
	}
	email.ifPresent(System.out::println);
	

	String emailToBeUsed = email.isPresent()?email.toString():"No Email is Given";
	System.out.println(emailToBeUsed);
	
	String emailToBeUsed2 = email.orElse("No Email is Given");
	System.out.println(emailToBeUsed2);
	//or
	String emailToBeUsed3 = email.orElseGet(()->"No Email is Given");
	System.out.println(emailToBeUsed3);
	//or
	String emailtoBeUsed4 = email.orElseThrow(NoSuchElementException::new);
	System.out.println(emailtoBeUsed4);
	
	Optional<String> inOptional = email.map((s)-> s.toUpperCase());
	inOptional.ifPresent(System.out::println);
	
}
}

