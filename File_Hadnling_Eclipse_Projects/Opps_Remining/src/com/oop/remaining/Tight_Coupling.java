package com.oop.remaining;
//tight coupling

class Engine{
	public void start() {
		System.out.println("Engine Started.............");
		
	}
}
class Car{
	private Engine engine;
	public Car() {
		this.engine = new Engine();
	}
	
	public void start() {
		engine.start();
	}
}
public class Tight_Coupling {
	
public static void main(String[] args) {
	
	Car c = new Car();
	c.start();
}
}
