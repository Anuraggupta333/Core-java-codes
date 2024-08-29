package com.Collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Adding a duplicate element (will not be added)
        numbers.add(10);

        // Printing the TreeSet
        System.out.println("TreeSet: " + numbers);

        // Accessing the first and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Removing an element
        numbers.remove(15);
        System.out.println("After removing 15: " + numbers);

        // Checking if an element exists
        System.out.println("Contains 20? " + numbers.contains(20));
        System.out.println("Contains 15? " + numbers.contains(15));

        // Navigating through the TreeSet
        System.out.println("Head set (up to 20): " + numbers.headSet(20));
        System.out.println("Tail set (from 20): " + numbers.tailSet(20));
        System.out.println("Sub set (from 10 to 25): " + numbers.subSet(10, 25));
    }
}
