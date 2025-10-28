package com.Java8.features;


public class ThreadLambda {
public static void main(String[] args) {
	Runnable runable = ()->{
		for(int i =0;i<10;i++) {
			System.out.println("Hello");
		}
	};
	
	Thread t1 = new Thread(runable);
	t1.start();
	for(int i =0;i<10;i++) {
		System.out.println("Bye");
	}
}
}
