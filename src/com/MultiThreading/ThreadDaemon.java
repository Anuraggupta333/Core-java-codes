package com.MultiThreading;

public class ThreadDaemon implements Runnable {

    // The run method that will be executed by the thread
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            // Print the current thread's name, its iteration number, and whether it's a daemon thread
            System.out.println(Thread.currentThread().getName() + " : " + i + " Daemon: " + Thread.currentThread().isDaemon());
            // Daemon threads are alive only while the main thread is running
        }
    }

    public static void main(String[] args) {
        // Create a new instance of ThreadDaemon
        ThreadDaemon task = new ThreadDaemon();

        // Create a new Thread with the ThreadDaemon instance
        Thread daemonThread = new Thread(task);
        daemonThread.setDaemon(true); // Set the thread as a daemon thread

        // Start the daemon thread
        daemonThread.start();

        // Demonstrating main thread execution
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

        // Note: Daemon threads are terminated when the main thread finishes execution
        // If the main thread completes its execution, the daemon thread will stop immediately
    }
}
