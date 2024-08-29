package com.MultiThreading;

public class ThreadYield implements Runnable {

    // The run method that will be executed by the thread
    @Override
    public void run() {
        // Print the name and priority of the current thread
        System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
        // Loop to print numbers 1 through 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        // Create and start two threads
        Thread thread1 = new Thread(new ThreadYield(), "Thread-1");
        Thread thread2 = new Thread(new ThreadYield(), "Thread-2");
        thread1.start();
        thread2.start();

        // Hint to the scheduler to give other threads a chance to execute
        Thread.yield(); // It is a hint to the thread scheduler to yield the CPU


        // Loop to print numbers 1 through 10 for the main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

        // Print the name and priority of the main thread
        System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
    }
}
