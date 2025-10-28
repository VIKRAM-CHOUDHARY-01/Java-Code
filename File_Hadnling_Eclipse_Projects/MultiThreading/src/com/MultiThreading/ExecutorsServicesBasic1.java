package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsServicesBasic1 {
public static void main(String[] args) {
	long startTime = System.currentTimeMillis();
//	Thread t[] = new Thread[9];
	ExecutorService es = Executors.newFixedThreadPool(9);
	for(int i = 1;i<10;i++) {
		int finalI = i;
		es.submit(()->{
			long result = factorial(finalI);
			System.out.println(result);
		});
//		t[i-1] = new Thread(()->{
//			long result= factorial(finalI);
//			System.out.println(result);
//		});
//		t[i-1].start(); 
	}
	es.shutdown();
	try {
		es.awaitTermination(15, TimeUnit.SECONDS);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	for(Thread t1 : t) {
//		try {
//			t1.join();
//		}catch(Exception e){
//			System.out.println(e);
//		}
//	}
	System.out.println("Total Time : " + (System.currentTimeMillis()-startTime));
}
static long factorial(int num) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	long fact = 1L;
	for(int i =1;i<=num;i++) {
		fact = i*fact;
	}
	return fact;
}
}
