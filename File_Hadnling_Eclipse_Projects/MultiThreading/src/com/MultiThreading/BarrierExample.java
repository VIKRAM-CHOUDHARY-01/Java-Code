package com.MultiThreading;

import java.util.concurrent.CyclicBarrier;

public class BarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All tasks reached barrier. Proceeding...");
        });

        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                System.out.println("Task " + id + " is doing some work...");
                try {
                    Thread.sleep(1000);
                    System.out.println("Task " + id + " waiting at barrier");
                    barrier.await(); // waits here
                    System.out.println("Task " + id + " passed the barrier");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

