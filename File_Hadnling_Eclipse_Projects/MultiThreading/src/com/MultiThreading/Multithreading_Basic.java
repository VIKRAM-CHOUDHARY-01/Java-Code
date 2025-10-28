package com.MultiThreading;

class A extends Thread{
	public void run() {
		for(int i =0;i<=100;i++) {
			System.out.println("Hii");
		}

	}
}
class B extends Thread{
	public void run() {
		for(int i =0;i<=100;i++) {
			System.out.println("Hello");
		}
		
	}
}

//MultiThreading Using Thread Class
public class Multithreading_Basic {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();
	}

}
