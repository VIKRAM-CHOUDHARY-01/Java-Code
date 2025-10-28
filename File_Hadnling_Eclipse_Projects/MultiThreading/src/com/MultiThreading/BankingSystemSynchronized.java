package com.MultiThreading;

class BankNew implements Runnable{
	private int balance = 100;
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " Attempting to Withdraw" + amount);
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName() + " Proccessing the Withdraw" + amount);
			try {
				Thread.sleep(4000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			balance-=amount;
			System.out.println(Thread.currentThread().getName() + " Withdrawal Completed, Remaining Balance" + balance);
		}else {
			System.out.println(Thread.currentThread().getName() + " Withdrawal Fail : Insufficiant Balance");
		}
	}
}
public class BankingSystemSynchronized {
	public static void main(String[] args) {
		BankNew BOB = new BankNew() {
			public void run() {
				withdraw(50);
			}
		};
		Thread t1 = new Thread(BOB, "Thread 1");
		Thread t2 = new Thread(BOB, "Thread 2");
		Thread t3 = new Thread(BOB, "Thread 3");
				
		t1.start();
		t2.start();
		t3.start();
		
	}

}
