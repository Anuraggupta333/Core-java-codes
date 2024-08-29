package com.MultiThreading;

// The ThreadSleep class implements Runnable to define a custom thread behavior
public class ThreadSleep implements Runnable {

    // The run() method is called when the thread is started
    @Override
    public void run() {
        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Print the current thread's name and the value of i
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                // Pause the current thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle interruption exception
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Create an instance of ThreadSleep
        ThreadSleep runnableInstance = new ThreadSleep();

        // Create a Thread object with the Runnable instance
        Thread thread1 = new Thread(runnableInstance);
        // Start the thread
        thread1.start();

        // Main thread sleeps for 2000 milliseconds (2 seconds)
        // Uncommenting the following line will pause the main thread for 2 seconds
        // Thread.sleep(2000);

        // Loop to print numbers from 1 to 10 for the main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main thread : " + i);
            // Optionally pause the main thread as well to see interleaved output
            // Thread.sleep(500); // Uncomment if you want to observe the interleaving better
        }
    }
}
