package com.Collection;

import java.util.ArrayList;

/**
 * Demonstrates various operations on ArrayList.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("Anurag");
        list1.add(200);
        list1.add(100);
        list1.add('c');
        System.out.println("List1: " + list1);

        // Create another ArrayList and add elements
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("Puneet");
        list2.add(100);
        // Uncomment the following line to add all elements from list1 to list2
        // list2.addAll(list1);
        System.out.println("List2: " + list2);

        // Check if list1 contains a specific element
        System.out.println("List1 contains 'Anurag': " + list1.contains("Anurag"));

        // Check if list1 is empty
        System.out.println("List1 is empty: " + list1.isEmpty());

        // Remove elements from list1
        list1.remove(1); // Removes element at index 1 (200 in this case)
        list1.remove("Anurag"); // Removes the first occurrence of the object "Anurag"
        System.out.println("List1 after removals: " + list1);

        // Uncomment the following line to remove all elements from list2
        // list2.clear();
        System.out.println("List2 after removal: " + list2);

        // Remove all elements of list1 from list2
        list2.removeAll(list1);
        System.out.println("List2 after removing elements of List1: " + list2);

        // Print the size of list2
        System.out.println("Size of List2: " + list2.size());
    }
}
