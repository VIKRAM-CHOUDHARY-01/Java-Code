package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Weekly_TestQ6 {
public static void main(String[] args) {
	// Write down the code for de-serialization process?
	
	try(
			FileInputStream fis = new FileInputStream("Person.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
		){
		Person newP = (Person) ois.readObject();
		System.out.println("De-serialized Succesfully : " + newP);
	}catch(IOException e) {
		System.out.println(e);
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
}
}
