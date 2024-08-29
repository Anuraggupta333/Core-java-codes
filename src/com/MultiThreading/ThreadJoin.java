package com.MultiThreading;

public class ThreadJoin {
    static class Task1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 1 - Iteration " + i);
                try {
                    Thread.sleep(100); // Optional: adding sleep to make output more readable
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Preserve interrupt status
                    System.out.println(e);
                }
            }
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 2 - Iteration " + i);
                try {
                    Thread.sleep(100); // Optional: adding sleep to make output more readable
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Preserve interrupt status
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        try {
            t1.join(); // Wait for Task1 to complete

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Preserve interrupt status
            System.out.println(e);
        }
        t2.start();


    }
}
