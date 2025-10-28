package com.MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankWithLock implements Runnable {
	private int balance = 100;
	private final Lock lock = new ReentrantLock();

	public void Withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " Attempting to Withdraw : " + amount);
		try {
			
			// lock.lock(); // then the other thread wait till it frees the lock, then proceddes, not like trylock which only try for given time and then go away.
			if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				if (balance >= amount) {
					System.out.println(Thread.currentThread().getName() + " Proccesing the Withdraw : " + amount);
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						// TODO: handle exception
						Thread.currentThread().interrupt();
					}finally {
						lock.unlock();
					}
					balance -= amount;
					System.out.println(
							Thread.currentThread().getName() + " Withdraw Completed, Remaning Amount : " + balance);
				} else {
					System.out.println(
							Thread.currentThread().getName() + " Withdrwal Fail, Insufficiant Balance : " + amount);
				}
			}else {
				System.out.println(Thread.currentThread().getName() + " Could not Acquire the lock, try again later : ");
			}

		} catch (Exception e) {
			// TODO: handle exception
			Thread.currentThread().interrupt();
		}

	}

}

public class BankingSystemWithExplicitLock {
	public static void main(String[] args) {
		BankWithLock SBI = new BankWithLock() {
			@Override
			public void run() {
				Withdraw(50);
			}
		};
		Thread t1 = new Thread(SBI, "Thread 1");
		Thread t2 = new Thread(SBI, "Thread 2");
		t1.start();
		t2.start();
		
	}

}
