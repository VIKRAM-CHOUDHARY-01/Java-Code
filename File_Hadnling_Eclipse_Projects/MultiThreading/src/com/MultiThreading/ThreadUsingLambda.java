package com.MultiThreading;

public class ThreadUsingLambda {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Hii");
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(() -> System.out.println("Bye"));
		t2.start();
	}
}
