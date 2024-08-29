package com.StringBuffer;

public class StringBufferCapacity {
    public static void main(String[] args) {
        // Create a new StringBuffer with Default capacity
        StringBuffer sb1 = new StringBuffer();

        // Create a new StringBuffer with an initial capacity of 50
        StringBuffer sb = new StringBuffer(50);

        // Print the initial capacity
        System.out.println("Initial capacity: " + sb.capacity()); // Output: 50

        // Append text to the StringBuffer
        sb.append("Hello World");

        // Print the length and capacity after appending
        System.out.println("Default capacity: " + sb1.capacity()); // Output: 16
        System.out.println("Length: " + sb.length()); // Output: 11
        System.out.println("Capacity: " + sb.capacity()); // Output: 50 (remains the same unless it needs to grow)
    }
}
