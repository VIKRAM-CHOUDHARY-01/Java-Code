package com.oop.remaining;

interface Engine1{
	void start();//public abstract
}

class DieselEngine implements Engine1{
	public void start() {
		System.out.println("Diesel Engine Started...");
	}
}
public class Loosly_Coupling {
public static void main(String[] args) {
	DieselEngine de = new DieselEngine();
	de.start();
}
}
