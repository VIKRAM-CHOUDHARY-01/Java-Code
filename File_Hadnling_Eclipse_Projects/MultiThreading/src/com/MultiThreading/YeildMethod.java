package com.MultiThreading;

class MyThread4 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println(i);
		
		}
	}
}
class MyThread5 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("Hello");
			Thread.yield();
		}
	}

}
public class YeildMethod {
public static void main(String[] args) {
	MyThread4 t4 = new MyThread4();
	MyThread5 t5 = new MyThread5();
	
	t4.start();
	t5.start();
}
}
