package com.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantExample implements Runnable{
	private Lock lock = new ReentrantLock();
	
	public void outerMethod() {
		lock.lock();
	
		try {
			System.out.println("Outer Method");
			innerMethod();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
	public void innerMethod() {
		lock.lock();
		try {
			System.out.println("Inner Method");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
	
}
public class ExplicitLock2 {
	public static void main(String[] args) {
		ReentrantExample rg = new ReentrantExample() {
			@Override
			public void run() {
				outerMethod();
			}
		};
		Thread t1 = new Thread(rg);
		
		t1.start();
		
	
	}

}
