package com.Collection;

import java.util.HashMap;

/**
 * Demonstrates the use of HashMap for storing key-value pairs.
 */
public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put(101, "Anurag");
        hashMap.put(102, "Shejal");
        hashMap.put(103, "Anmol");
        hashMap.put(104, "Puneet");

        // Print the contents of the HashMap
        System.out.println("HashMap contents: " + hashMap);
    }
}
