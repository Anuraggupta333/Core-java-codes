package com.Collection;

import java.util.TreeMap;
import java.util.Map;

/**
 * Demonstrates various operations with TreeMap.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        map.put(101, "Anurag");
        map.put(102, "Appu");
        map.put(15, "Shejal");
        map.put(104, "Anmol");

        // Print the entire TreeMap
        System.out.println("TreeMap: " + map);

        // Retrieve and print the first entry (smallest key)
        System.out.println("First Entry: " + map.firstEntry());

        // Retrieve and print the entry greater than or equal to the given key
        System.out.println("Ceiling Entry for 16: " + map.ceilingEntry(16));

        // Retrieve and print the entry less than or equal to the given key
        System.out.println("Floor Entry for 110: " + map.floorEntry(110));

        // Retrieve and print the value associated with key 104
        System.out.println("Value for key 104: " + map.get(104));

        // Attempt to retrieve and print the value associated with a non-existing key
        System.out.println("Value for key 105: " + map.get(105));

        // Print a view of the portion of this map whose keys are less than the specified key
        System.out.println("HeadMap up to key 104: " + map.headMap(104));

        // Retrieve and print the entry strictly greater than the given key
        System.out.println("Entry greater than 102: " + map.higherEntry(102));

        // Print the set of keys contained in the TreeMap
        System.out.println("Key Set: " + map.keySet());

        // Uncomment the following lines to see additional TreeMap operations
        // Print and remove the first (lowest) entry from the TreeMap
        // System.out.println("Polled First Entry: " + map.pollFirstEntry());
        // System.out.println("TreeMap after polling first entry: " + map);

        // Print and remove the last (highest) entry from the TreeMap
        // System.out.println("Polled Last Entry: " + map.pollLastEntry());
        // System.out.println("TreeMap after polling last entry: " + map);

        // Print a view of the portion of this map from the start key (inclusive) to the end key (exclusive)
        System.out.println("SubMap from 15 to 102: " + map.subMap(15, 102));
    }
}
