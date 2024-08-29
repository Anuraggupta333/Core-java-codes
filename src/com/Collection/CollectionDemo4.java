package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Demonstrates basic operations with List and Set collections.
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        // Demonstrating ArrayList (List implementation)
        List<Object> list = new ArrayList<>();
        list.add("anurag");  // Adding a String
        list.add(100);       // Adding an Integer
        list.add(100);       // Adding another Integer (duplicate)
        list.add(null);      // Adding a null value
        System.out.println("ArrayList: " + list);

        // Demonstrating HashSet (Set implementation)
        Set<Object> set = new HashSet<>();
        set.add("anurag");  // Adding a String
        set.add(100);       // Adding an Integer
        set.add(100);       // Attempting to add duplicate Integer (will be ignored)
        set.add(null);      // Adding a null value
        System.out.println("HashSet: " + set);

        // Additional Demonstrations

        // Iterating over the ArrayList using Iterator
        Iterator<Object> listIterator = list.iterator();
        System.out.println("Iterating over ArrayList:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Iterating over the HashSet using Iterator
        Iterator<Object> setIterator = set.iterator();
        System.out.println("Iterating over HashSet:");
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
    }
}
