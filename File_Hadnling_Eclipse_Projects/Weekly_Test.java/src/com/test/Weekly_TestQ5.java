package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private final static long serialVersionUID =1L;
	private String name;
	private int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Person name : "+ name + " and his age is : "+ age; 
	}
	
}
public class Weekly_TestQ5 {
public static void main(String[] args) {
	//Write down the code for serialization process?
	Person p = new Person("Vikram Choudhary", 21);
	try(
			FileOutputStream fos = new FileOutputStream("Person.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos); 
			){
		
			oos.writeObject(p);
			System.out.println("Object Serialized Successfully");
		
		
	}catch(IOException e){
		System.out.println(e);
		
	}
	
	
}
}
