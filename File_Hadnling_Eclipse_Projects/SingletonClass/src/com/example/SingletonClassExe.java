package com.example;

// Singleton class to ensure only one instance is created
class Singleton {

	// Step 2: Declare a private static reference variable of the same class
	// This holds the one and only instance of the class
	private static Singleton singleObj = null;

	// Step 1: Private constructor so no other class can instantiate it directly
	private Singleton() {
		// Private constructor to restrict instantiation
	}

	// Step 3: Public static method to provide access to the instance
	public static Singleton getObj() {
		// Create a new instance only if it doesn't exist (lazy initialization)
		if (singleObj == null) {
			singleObj = new Singleton();
		}
		// Return the existing or newly created instance
		return singleObj;
	}
}

public class SingletonClassExe {
	public static void main(String[] args) {
		// All these calls return the same Singleton instance (same memory address)
		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());
	}
}
