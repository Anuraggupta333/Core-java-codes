package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Demonstrates the use of HashSet to store unique elements and various operations on it.
 */
public class HashSetDemo {

    public static void main(String[] args) {
        // Create an ArrayList and add various elements to it
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("react");
        arrayList.add(10);
        arrayList.add(20);

        // Create a HashSet and add elements from ArrayList, and other elements
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.addAll(arrayList); // Add all elements from ArrayList
        hashSet.add("deepak");
        hashSet.add(10); // Duplicates are ignored
        hashSet.add(20); // Duplicates are ignored
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(30); // Duplicate, ignored

        // Print the HashSet
        System.out.println("HashSet contents: " + hashSet);
        System.out.println("Size of HashSet: " + hashSet.size());

        // Iterate over the HashSet using an iterator
        System.out.println("Iterating over HashSet:");
        Iterator<Object> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Create a HashSet with type safety (String only)
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Anurag");
        stringHashSet.add("10"); // Note: this is a String, not an integer

        // Print the String HashSet
        System.out.println("String HashSet contents: " + stringHashSet);
    }
}
