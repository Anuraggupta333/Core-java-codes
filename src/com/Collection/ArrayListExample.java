package com.Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to hold Integer and String objects
        ArrayList<Object> list = new ArrayList<>(); //initial capacity 10


        // Add elements to the ArrayList
        list.add(101);
        list.add(102);
        list.add("Anurag");
        list.add(103);
        list.add(104);
        list.add(104); // Adding duplicate element
        list.add(null); // Adding null values
        list.add(null);

        // Update the element at index 0
        list.set(0, 100);

        // Print the index of the element "Anurag" (case-sensitive, so "anurag" would return -1)
        System.out.println("Index of 'Anurag': " + list.indexOf("Anurag")); // Output: 2

        // Print the entire ArrayList
        System.out.println("List contents: " + list);

        // Create a new ArrayList and initialize it with the elements of the existing ArrayList
        ArrayList<Object> list2 = new ArrayList<>(list);

        // Print the contents of the new ArrayList
        System.out.println("New list contents: " + list2);
    }
}
