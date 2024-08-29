package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Demonstrates basic operations with HashMap including iteration over key-value pairs.
 */
public class HashMapDemo {

    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put(101, "Anurag");
        hashMap.put(102, "Appu");
        hashMap.put(103, "Anmol");

        // Print the HashMap
        System.out.println("HashMap contents: " + hashMap);

        // Iterate over the entries using enhanced for loop
        System.out.println("Iterating over HashMap entries:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Uncomment the following code to iterate using Iterator
        // Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        // Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        // while (iterator.hasNext()) {
        //     Map.Entry<Integer, String> entry = iterator.next();
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
    }
}
