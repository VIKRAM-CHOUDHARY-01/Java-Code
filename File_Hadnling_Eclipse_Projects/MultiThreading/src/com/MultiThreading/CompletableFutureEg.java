package com.MultiThreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEg {
public static void main(String[] args) {
	Void future = CompletableFuture.runAsync(()->{

		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Running a Thread");
	}).join();
	
	System.out.println("Completed");
}
}
