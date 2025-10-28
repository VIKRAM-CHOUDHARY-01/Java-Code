package com.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExecuterService {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService es = Executors.newFixedThreadPool(3);
	CountDownLatch latch = new CountDownLatch(3);
	es.submit(new DependentService(latch));
	es.submit(new DependentService(latch));
	es.submit(new DependentService(latch));
	latch.await();
	
//	Future<String> fs1 = es.submit(new DependentService());
//	Future<String> fs2 = es.submit(new DependentService());
//	Future<String> fs3 = es.submit(new DependentService());
//	fs1.get();
//	fs2.get();
//	fs3.get();
	System.out.println("All Depending services finished. Starting main service");
	es.shutdown();
	
}
static class DependentService implements Callable<String>{
	private CountDownLatch latch = null;
	DependentService(CountDownLatch latct){
		this.latch = latch;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		try {
			
			System.out.println(Thread.currentThread().getName() + " Service Started");
			
		}finally{
			latch.countDown();
		}
		return "ok";
	}
	
}
}
