package com.MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

class VolatileIncreament{
//	private volatile int count = 0; -> will not change anything since we still taking one resource by two threads at same time
//	private  int count = 0;
	private AtomicInteger count= new AtomicInteger(0); // now it will return 2000 always
	public void countIncreament() {
		count.getAndIncrement();
		
	}
	public void getCount() {
		System.out.println(count.get());
	}
}
public class AtomicExample {
public static void main(String[] args) throws InterruptedException {
	VolatileIncreament vc = new VolatileIncreament();
	Thread t1 = new Thread(()->{
		for(int i =1;i<=1000;i++) {
			vc.countIncreament();
		}
	});
	Thread t2 = new Thread(()->{
			for(int i =1;i<=1000;i++) {
				vc.countIncreament();
			}
	});
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	vc.getCount();
}
}
