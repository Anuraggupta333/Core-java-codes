package com.Collection;

import java.util.LinkedList;

/**
 * Demonstrates various operations on LinkedList.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<Object> list1 = new LinkedList<>();
        list1.add("Anurag");
        list1.add("Anurag"); // Duplicate entry
        list1.add(20);
        list1.add(200);
        list1.add(1);
        System.out.println("List1: " + list1);

        // Add an element at the beginning of the list
        list1.addFirst("appu");
        System.out.println("First Element: " + list1.getFirst());

        // Retrieve and print the last element
        System.out.println("Last Element: " + list1.getLast());

        // Create another LinkedList and add elements
        LinkedList<Object> list2 = new LinkedList<>();
        list2.add("Anurag");
        list2.add("Anuragg");
        list2.add(20);
        list2.add(200.2);
        list2.add(1);
        System.out.println("List2: " + list2);

        // Check if List2 contains a specific element
        System.out.println("Contains 'Anurag': " + list2.contains("Anurag"));

        // Check if List2 contains all elements of List1
        System.out.println("Contains all elements of List1: " + list2.containsAll(list1));

        // Remove all elements of List1 from List2
        list2.removeAll(list1);
        System.out.println("List2 after removing elements of List1: " + list2);
    }
}
