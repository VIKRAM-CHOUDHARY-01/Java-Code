package com.MultiThreading;

class SharedResource {
	private boolean hasData;
	private int data;

	public synchronized void produce(int i) {
		if (hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			hasData = true;
			data = i;
			System.out.println("Produced : " + i);
			notify();
		}
	}

	public synchronized int consume() {
		if (!hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			hasData = false;
			System.out.println("Consumed: " + data);
			notify();
		    return data;
	}
}

class Produce implements Runnable{
	private SharedResource rs;
	Produce(SharedResource rs){
		this.rs = rs;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++) {
			rs.produce(i);
		}
		
	}
}
class Consume implements Runnable{
	private SharedResource rs;
	Consume(SharedResource rs){
		this.rs = rs;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) {
			int data = rs.consume();
		
		}
		
	}
}

public class ThreadComunication {
	public static void main(String[] args) {
		SharedResource rs = new SharedResource();
		Thread t1 = new Thread(new Produce(rs));
		Thread t2 = new Thread(new Consume(rs));
		t1.start();
		t2.start();
	}

}
