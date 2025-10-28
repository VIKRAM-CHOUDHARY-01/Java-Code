package com.MultiThreading;

class AvrageThread implements Runnable{

	@Override
	public void run() {
		int[] arr = {1,20,50,15,30};
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
			
		}
		int avg = sum/arr.length;
		System.out.println(avg);
	}
}
class Square implements Runnable{
	@Override
	public void run() {
		int[] arr = {1,20,50,15,30};
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println("Square of Element of index " + i + " : "+arr[i]*arr[i]);
		}
	}
}
public class MultiThreading_Questions {
public static void main(String[] args) {
	
	AvrageThread at = new AvrageThread();
	Thread t1 = new Thread(at);
	Square sq = new Square();
	Thread t2 = new Thread(sq);
	t2.setPriority(Thread.MAX_PRIORITY);
	t1.setPriority(Thread.MIN_PRIORITY);
	
	t1.start();
	t2.start();
	
}
}
