package com.Collection;

import java.util.Vector;

/**
 * Demonstrates various operations with Vector.
 */
public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector with no initial capacity
        Vector<Object> v1 = new Vector<>(); //Initial capacity =10;

        // Add elements to the Vector
        v1.add("Anurag");
        v1.add(102.2);
        v1.add("Deepak");
        v1.add("Anmol");
        v1.add("Anurag");
        v1.add(102.2);
        v1.add("Deepak");
        v1.add("Anmol");
        v1.add("Anurag");
        v1.add(102.2);
        v1.add("Deepak");
        v1.add("Anmol");

        // Print the Vector
        System.out.println("Initial Vector: " + v1);

        // Add an element at the end of the Vector
        v1.addElement("Seeta");

        // Remove the first occurrence of the specified element
        System.out.println("Removed 'Anmol': " + v1.remove("Anmol"));
        System.out.println("Vector after removal: " + v1);

        // Print the capacity of the Vector
        System.out.println("Capacity: " + v1.capacity()); // Capacity doubles as elements are added = oldcapacity *2

        // Print the size of the Vector
        System.out.println("Size: " + v1.size());

        // Print the element at index 0
        System.out.println("Element at index 0: " + v1.get(0));
    }
}
