package com.MultiThreading;

class MyThread3 implements Runnable{
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(8000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
}
public class ThreadInterruptedMethod  {
public static void main(String[] args) throws Exception{
	
	MyThread3 mt = new MyThread3();
	Thread t3 = new Thread(mt);
	t3.start();
	t3.interrupt();
	
	
	
}
}
