package com.MultiThreading;

class MyThread1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadSleepMethod {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		Thread obj = new Thread(t1);
		obj.start();
	}
	
	

}
