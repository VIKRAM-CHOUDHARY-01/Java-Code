package com.MultiThreading;

class Counter{
	int count = 0;
	public void increament() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
class Thread1 extends Thread{
	private Counter count;
	Thread1(Counter count){
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 1;i<=1000;i++) {
			count.increament();
		}
		
	}
	
}
class Thread2 extends Thread{
	private Counter count;
	Thread2(Counter count){
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 1;i<=1000;i++) {
			count.increament();
		}
		
	}
	
}
public class Synchronization_Basics {
public static void main(String[] args) {
	
	Counter cn = new Counter();
	Thread1 t1 = new Thread1(cn);
	Thread2 t2 = new Thread2(cn);
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(cn.getCount());
	
	
}
}
