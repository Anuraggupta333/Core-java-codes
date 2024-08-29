package com.MultiThreading;

public class ThreadInterrupted extends Thread {

    // Override the run method to define the thread's behavior
    @Override
    public void run() {
        try {
            System.out.println( Thread.currentThread().isInterrupted());
            System.out.println( Thread.interrupted());//it changes the value of interrupted flag to false
            System.out.println( Thread.interrupted());
            // Loop to perform task iterations
            for (int i = 0; i < 5; i++) {
                // Print the current iteration of the task
                System.out.println("Task 1 - Iteration " + i);

                // Sleep for 1 second to simulate work being done
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Handle interruption if the thread is interrupted while sleeping
            System.out.println("Thread was interrupted. Exiting...");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create a new instance of MyThread
        ThreadInterrupted thread = new ThreadInterrupted();

        // Start the thread, which will call the run method
        thread.start();

        // Interrupt the thread shortly after starting it
        // This may not have an immediate effect as the thread may not be in the sleeping state yet
        thread.interrupt();

        // Main thread performing its own task
        for (int i = 0; i < 5; i++) {
            // Print the current iteration of the main thread
            System.out.println("Main thread - Iteration " + i);

            // Sleep for 1 second to simulate work being done
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
