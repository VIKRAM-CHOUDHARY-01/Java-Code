package com.MultiThreading;

class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0;i<23;i++) {
			System.out.println("Heart and Soul");
		}
	}
}
public class ThreadJoinMethod {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Hello");
	MyThread2 obj = new MyThread2();
	Thread t1 = new Thread(obj);
    t1.start();
    t1.join();
	System.out.println("Hii");
}
}
