package com.String;

import java.util.Scanner;

/**
 * This program prompts the user for their name and prints a personalized greeting.
 */
public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name:");

        // Read the user input as a String
        String name = sc.nextLine();

        // Print a greeting message using the entered name
        System.out.println("Hello, " + name + "!");

        // Close the Scanner to release system resources
        sc.close();
    }
}
