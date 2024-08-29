package com.MultiThreading;

public class ThreadPriority implements Runnable {

    // The run() method is called when the thread is started
    @Override
    public void run() {
        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Print the current thread's name, the value of i, and the thread's priority
            System.out.println(Thread.currentThread().getName() + " : " + i + " Priority: " + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        // Create an instance of ThreadPriority
        ThreadPriority runnableInstance = new ThreadPriority();

        // Create a thread with the Runnable instance and name it "Thread 1"
        Thread t1 = new Thread(runnableInstance, "Thread 1");
        // Set the priority of the thread to normal (default priority)
        t1.setPriority(Thread.NORM_PRIORITY);
        // Start the thread
        t1.start();

        // Create another thread with the Runnable instance and name it "Thread 2"
        Thread t2 = new Thread(runnableInstance, "Thread 2");
        // Start the thread before setting its priority
        t2.start();
        // Set the priority of the thread to minimum
        t2.setPriority(Thread.MIN_PRIORITY);

        // Set the priority of the main thread to minimum
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        // Loop to print numbers from 1 to 10 for the main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i + " Priority: " + Thread.currentThread().getPriority());
        }
    }
}
