package com.MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorSchdulaer {
public static void main(String[] args) {
	ScheduledExecutorService se = Executors.newScheduledThreadPool(1);
	se.schedule(()->
	System.out.println("Task executed after 5 seconds delay!"), 5, TimeUnit.SECONDS);
	se.shutdown();
}
}
