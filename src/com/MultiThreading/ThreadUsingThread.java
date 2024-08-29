package com.MultiThreading;

public class ThreadUsingThread extends Thread {
    // Override the run method to define the task to be executed by the thread
    @Override
    public void run() {
        // Print numbers from 1 to 10 in the thread
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        // Create and start the first thread
        ThreadUsingThread thread1 = new ThreadUsingThread();
        thread1.start(); // This will call the run() method in the new thread

        // Create and start the second thread
        ThreadUsingThread thread2 = new ThreadUsingThread();
        thread2.start(); // This will also call the run() method in another new thread

        // Print numbers from 1 to 10 in the main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
