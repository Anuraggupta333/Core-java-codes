package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * CollectionExample demonstrates the use of different Java Collections.
 */
public class CollectionExample {

    public static void main(String[] args) {

        // ArrayList example
        List<Object> arrayList = new ArrayList<>();
        arrayList.add("Anurag");  // Adding a String
        arrayList.add(20);        // Adding an Integer
        arrayList.add('c');       // Adding a Character
        System.out.println("ArrayList: " + arrayList);

        // HashSet example
        Set<Object> hashSet = new HashSet<>();
        hashSet.add("rahul");     // Adding a String
        hashSet.add(true);        // Adding a Boolean
        hashSet.add(20);          // Adding an Integer
        System.out.println("HashSet: " + hashSet);

        // List reference pointing to an ArrayList object
        List<Object> list = new ArrayList<>();
        list.add("anurag");      // Adding a String
        list.add(10);            // Adding an Integer
        list.add('a');           // Adding a Character
        System.out.println("List (ArrayList): " + list);

        // LinkedList example
        List<Object> linkedList = new LinkedList<>();
        linkedList.add("example"); // Adding a String
        linkedList.add(30);        // Adding an Integer
        linkedList.add('b');       // Adding a Character
        System.out.println("LinkedList: " + linkedList);

        // HashSet example with Set reference
        Set<Object> hashSet2 = new HashSet<>();
        hashSet2.add("sample");   // Adding a String
        hashSet2.add(50);         // Adding an Integer
        hashSet2.add(false);      // Adding a Boolean
        System.out.println("HashSet (Set reference): " + hashSet2);
    }
}
