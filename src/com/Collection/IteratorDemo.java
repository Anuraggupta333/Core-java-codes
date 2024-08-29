package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demonstrates the use of an Iterator to traverse and modify an ArrayList.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // Create an ArrayList with mixed types
        ArrayList<Object> mixedList = new ArrayList<>();
        mixedList.add("Anurag");
        mixedList.add(101);
        mixedList.add('c');
        System.out.println("Mixed List: " + mixedList);

        // Create an ArrayList of integers and populate it with numbers 1 to 10
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numberList.add(i);
        }

        // Obtain an iterator for the numberList
        Iterator<Integer> iterator = numberList.iterator();

        // Traverse the list and remove odd numbers
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                // Print even numbers
                System.out.println(number);
            } else {
                // Remove odd numbers
                iterator.remove();
            }
        }

        // Print the modified list (should only contain even numbers)
        System.out.println("Modified List with Even Numbers: " + numberList);
    }
}
