package com.MultiThreading;

// The ThreadUsingRunnable class implements the Runnable interface to define a custom thread behavior
public class ThreadUsingRunnable implements Runnable {

    // The run() method is called when the thread is started
    @Override
    public void run() {
        // A loop is used to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // The current thread's name and the value of i are printed
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        // Create a ThreadUsingRunnable instance
        ThreadUsingRunnable runnableInstance = new ThreadUsingRunnable();

        // Create a Thread object with the Runnable instance
        Thread thread1 = new Thread(runnableInstance);
        // Start the thread
        thread1.start();

        // Create and start another thread using an anonymous Runnable instance
        Thread thread2 = new Thread(new ThreadUsingRunnable());
        thread2.start();

        // The main thread prints numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
