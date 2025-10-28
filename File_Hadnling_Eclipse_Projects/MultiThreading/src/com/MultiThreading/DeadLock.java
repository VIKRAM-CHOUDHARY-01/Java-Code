package com.MultiThreading;
public class DeadLock {

    // Lock objects
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    // Thread 1 tries to acquire lockA and then lockB
    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lockA) {
                System.out.println("Thread 1: Acquired lockA, waiting for lockB...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lockB) {
                    System.out.println("Thread 1: Acquired lockB.");
                }
            }
        }
    }

    // Thread 2 tries to acquire lockB and then lockA
    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lockB) {
                System.out.println("Thread 2: Acquired lockB, waiting for lockA...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lockA) {
                    System.out.println("Thread 2: Acquired lockA.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
