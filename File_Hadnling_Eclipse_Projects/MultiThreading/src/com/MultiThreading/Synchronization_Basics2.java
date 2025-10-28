package com.MultiThreading;

class Counter1{
	static int count = 0;
//	public synchronized void increament() {
//		count++;
//	}
	
//	public void increament() {
//		synchronized (this) {
//			count++;
//		}
//		
//	}
	
	public static void increament() {
		synchronized (Counter1.class) {
			count++;
		}

}
	public int getCount() {
		return count;
	}
}
class Thread3 extends Thread{
	private Counter1 count;
	Thread3(Counter1 count){
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 1;i<=1000;i++) {
			count.increament();
		}
		
	}
	
}
class Thread4 extends Thread{
	private Counter1 count;
	Thread4(Counter1 count){
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 1;i<=1000;i++) {
			count.increament();
		}
		
	}
	
}
public class Synchronization_Basics2 {
public static void main(String[] args) {
	
	Counter1 cn = new Counter1();
	Thread3 t1 = new Thread3(cn);
	Thread4 t2 = new Thread4(cn);
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
