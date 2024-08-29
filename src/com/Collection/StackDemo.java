package com.Collection;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Demonstrates basic operations with Stack and Enumeration.
 */
public class StackDemo {
    public static void main(String[] args) {
        // Create a Stack and add elements of different types
        Stack<Object> stack = new Stack<>();
        stack.push("anurag");   // Add a String to the stack
        stack.push(102.2);      // Add a Double to the stack
        stack.push("appu");    // Add another String to the stack
        stack.push(true);      // Add a Boolean to the stack
        stack.add(1000);       // Add an Integer using Collection method
        stack.add(2, "puneet"); // Add a String at index 2 using List method

        // Print the Stack
        System.out.println("Stack: " + stack);

        // Remove and print the top element from the Stack
        System.out.println("Popped element: " + stack.pop());

        // Uncomment the following lines to see additional Stack operations
        // Print the top element of the Stack without removing it
        // System.out.println("Top element (peek): " + stack.peek());

        // Search for an element and print its position
        // System.out.println("Position of 'anurag': " + stack.search("anurag")); // Returns -1 if not found, else returns position

        // Iterate over the Stack using Enumeration
        Enumeration<Object> enumeration = stack.elements();
        System.out.println("Elements in the Stack:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
