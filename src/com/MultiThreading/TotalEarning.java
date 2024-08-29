package com.MultiThreading;

public class TotalEarning extends Thread {
    private int total = 0;

    // Thread's run method that performs the calculation
    public void run() {
        synchronized (this) { // Synchronize on the current thread instance
            for (int i = 0; i < 10; i++) {
                total += 100; // Update total earnings
                try {
                    Thread.sleep(100); // Simulate time taken for earnings calculation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Notify waiting threads (not necessarily needed here)
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TotalEarning te = new TotalEarning();
        te.start(); // Start the earnings thread
        synchronized (te) { // Synchronize on the same object as the thread
            // Wait until the thread has completed its execution
            te.wait(); // This will wait for the thread to notify or complete
            // Print the total earnings after the thread has finished
            System.out.println("Total earnings = " + te.total);
        }

        // Alternatively, use join to wait for the thread to finish
        te.join(); // Ensure the thread has finished before proceeding
        System.out.println("Total earnings after thread completion = " + te.total);
    }
}
