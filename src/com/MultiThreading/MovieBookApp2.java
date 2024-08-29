package com.MultiThreading;

// Thread class to handle booking with the BookTheaterSeat instance
class MyThread extends Thread {
    private final BookTheaterSeat b; // Reference to BookTheaterSeat instance
    private final int seat; // Number of seats to book

    // Constructor to initialize the BookTheaterSeat instance and seat number
    MyThread(BookTheaterSeat b, int seat) {
        this.b = b;
        this.seat = seat;
    }

    // Thread execution logic
    @Override
    public void run() {
        b.bookSeatInstance(seat); // Call the instance method to book seats
    }
}

// Another Thread class to handle booking with the BookTheaterSeat instance
class MyThread2 extends Thread {
    private final BookTheaterSeat b; // Reference to BookTheaterSeat instance
    private final int seat; // Number of seats to book

    // Constructor to initialize the BookTheaterSeat instance and seat number
    MyThread2(BookTheaterSeat b, int seat) {
        this.b = b;
        this.seat = seat;
    }

    // Thread execution logic
    @Override
    public void run() {
        b.bookSeatInstance(seat); // Call the instance method to book seats
    }
}

// Main class to run the application
public class MovieBookApp2 {
    public static void main(String[] args) {
        // Create instances of BookTheaterSeat
        BookTheaterSeat b1 = new BookTheaterSeat();
        BookTheaterSeat b2 = new BookTheaterSeat();

        // Create and start threads for b1
        MyThread t1 = new MyThread(b1, 7);
        MyThread2 t2 = new MyThread2(b1, 9);
        t1.start();
        t2.start();

        // Create and start threads for b2
        MyThread t3 = new MyThread(b2, 7);
        MyThread2 t4 = new MyThread2(b2, 9);
        t3.start();
        t4.start();

        // Optional: Wait for all threads to complete (optional for main thread)
        try {
            t1.join(); // Ensure main thread waits for t1 to finish
            t2.join(); // Ensure main thread waits for t2 to finish
            t3.join(); // Ensure main thread waits for t3 to finish
            t4.join(); // Ensure main thread waits for t4 to finish
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle interruptions during join
        }
    }
}
