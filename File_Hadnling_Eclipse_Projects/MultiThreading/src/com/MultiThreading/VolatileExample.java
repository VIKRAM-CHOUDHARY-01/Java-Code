package com.MultiThreading;

class SharedObj{
	private volatile boolean flag = false;
	
	public void setFlagTru() {
		System.out.println("Writer thread made the Flag true");
		flag = true;
		
	}
	public void ifFlagTru() {
		while(!flag) {
			//do nothing
		}
		System.out.println("Flag is True");
	}
}
public class VolatileExample {
public static void main(String[] args) {
	SharedObj sh = new SharedObj();
	Thread writerThread = new Thread(()->{
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			// TODO: handle exception
		}
		sh.setFlagTru();
	});
	Thread readerThread = new Thread(()->{
			sh.ifFlagTru();
	});
	writerThread.start();
	readerThread.start();
}
}
