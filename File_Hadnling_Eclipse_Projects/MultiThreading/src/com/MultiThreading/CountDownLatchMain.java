package com.MultiThreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {
public static void main(String[] args) throws InterruptedException {
    CountDownLatch latch = new CountDownLatch(3);

    // 3 worker threads
    for (int i = 1; i <= 3; i++) {
        final int id = i;
        new Thread(() -> {
            System.out.println("Worker " + id + " is working...");
            try {
                Thread.sleep(1000); // simulate task
            } catch (InterruptedException e) {}
            System.out.println("Worker " + id + " finished");
            latch.countDown(); // decrease latch count
        }).start();
    }

    // main thread waits
    System.out.println("Main thread waiting for workers...");
    latch.await();  // blocks here until count = 0
    System.out.println("All workers done. Main thread resumes.");
}
}
