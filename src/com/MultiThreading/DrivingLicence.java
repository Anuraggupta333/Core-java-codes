package com.MultiThreading;

class MedicalWork implements Runnable {
    @Override
    public void run() {
        System.out.println("Medical work started");
        try {
            // Simulate medical work taking some time
            Thread.sleep(5000); // Sleep for 5 seconds
            System.out.println("Medical work finished");
        } catch (InterruptedException e) {
            // Handle interruption during sleep
            e.printStackTrace();
        }
    }
}

class TestDrive implements Runnable {
    @Override
    public void run() {
        System.out.println("Test drive started");
        try {
            // Simulate test drive taking some time
            Thread.sleep(5000); // Sleep for 5 seconds
            System.out.println("Test drive finished");
        } catch (InterruptedException e) {
            // Handle interruption during sleep
            e.printStackTrace();
        }
    }
}

class OfficerSign implements Runnable {
    @Override
    public void run() {
        System.out.println("Official work started");
        try {
            // Simulate official work taking some time
            Thread.sleep(5000); // Sleep for 5 seconds
            System.out.println("Official work finished");
        } catch (InterruptedException e) {
            // Handle interruption during sleep
            e.printStackTrace();
        }
    }
}

public class DrivingLicence {
    public static void main(String[] args) throws InterruptedException {
        // Create and start threads for each task
        Thread t1 = new Thread(new MedicalWork());
        t1.start();
        t1.join(); // Wait for t1 to finish before starting the next task

        Thread t2 = new Thread(new TestDrive());
        t2.start();
        t2.join(); // Wait for t2 to finish before starting the next task

        Thread t3 = new Thread(new OfficerSign());
        t3.start();
        t3.join(); // Wait for t3 to finish before ending the main method

        System.out.println("All tasks completed");
    }
}
