package com.Collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Demonstrates basic operations with Enumeration and Vector.
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        // Create a Vector and add elements of different types
        Vector<Object> vector = new Vector<>();
        vector.add(10);          // Adding an Integer
        vector.add("deepak");    // Adding a String
        vector.add(15.02);       // Adding a Double

        // Print the Vector
        System.out.println("Vector: " + vector);

        // Obtain an Enumeration for the Vector
        Enumeration<Object> enumeration = vector.elements();

        // Iterate over the Vector using Enumeration
        System.out.println("Elements in the Vector:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
