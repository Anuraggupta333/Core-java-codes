package com.FileHandling;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = null; // Initialize PrintWriter to null
        try {
            // Initialize PrintWriter with the file "ghi.txt"
            pw = new PrintWriter("ghi.txt");

            // Write lines of text to the file
            pw.println("Hello World");
            pw.println("My name is Anurag"); // Capitalized 'Anurag' for consistency
            pw.print("I have recently completed MCA with marks ");
            pw.print(84.5); // Print the marks

        } catch (Exception e) {
            // Print stack trace for any exceptions that occur
            e.printStackTrace();
        }finally {
            // Ensure the PrintWriter is closed to release resources
            if (pw != null) {
                pw.close();
            }
        }
    }
}
