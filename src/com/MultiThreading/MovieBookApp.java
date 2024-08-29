package com.MultiThreading;

class BookTheaterSeat {
    private static int totalSeatsStatic = 10; // Static variable for class-level synchronization
    private int totalSeatsInstance = 10; // Instance variable for instance-level synchronization

    // Static synchronized method to handle class-level synchronization
    synchronized static void bookSeatStatic(int seat) {
        if (totalSeatsStatic >= seat) {
            System.out.println(seat + " Seat(s) booked successfully (Static Method).");
            totalSeatsStatic -= seat;
            System.out.println(totalSeatsStatic + " seats remaining (Static Method).");
        } else {
            System.out.println("Seats not available (Static Method).");
            System.out.println(totalSeatsStatic + " seats remaining (Static Method).");
        }
    }

    // Instance method with synchronized block to handle instance-level synchronization
    void bookSeatInstance(int seat) {
        synchronized (this) { // Synchronize only the critical section using this instance's lock
            if (totalSeatsInstance >= seat) {
                System.out.println(seat + " Seat(s) booked successfully (Instance Method).");
                totalSeatsInstance -= seat;
                System.out.println(totalSeatsInstance + " seats remaining (Instance Method).");
            } else {
                System.out.println("Seats not available (Instance Method).");
                System.out.println(totalSeatsInstance + " seats remaining (Instance Method).");
            }
        }
    }
}

public class MovieBookApp extends Thread {
    private static final BookTheaterSeat bStatic = new BookTheaterSeat(); // Shared instance for static method
    private final BookTheaterSeat bInstance = new BookTheaterSeat(); // Instance for instance method
    private final int seat; // Number of seats to book
    private final boolean useStaticMethod; // Flag to choose which method to use

    // Constructor to initialize seat number and method choice
    public MovieBookApp(int seat, boolean useStaticMethod) {
        this.seat = seat;
        this.useStaticMethod = useStaticMethod;
    }

    @Override
    public void run() {
        if (useStaticMethod) {
            // Use static synchronized method
            BookTheaterSeat.bookSeatStatic(seat);
        } else {
            // Use instance method with synchronized block
            bInstance.bookSeatInstance(seat);
        }
    }

    public static void main(String[] args) {
        // Create and start threads with different seat requests and method choices
        MovieBookApp app1 = new MovieBookApp(7, true); // Use static method
        MovieBookApp app2 = new MovieBookApp(6, false); // Use instance method with synchronized block

        app1.start(); // Start thread that uses static method
        app2.start(); // Start thread that uses instance method

        // Wait for both threads to complete
        try {
            app1.join(); // Ensure main thread waits for app1 to finish
            app2.join(); // Ensure main thread waits for app2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle interruptions during join
        }
    }
}
