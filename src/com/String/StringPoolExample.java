package com.String;

public class StringPoolExample {
    public static void main(String[] args) {
        // Create string literals
        String poolStr1 = "Java";
        String poolStr2 = "Java";

        // Create new String objects
        String heapStr1 = new String("Java");
        String heapStr2 = new String("Java");

        // Comparing references
        System.out.println("poolStr1 == poolStr2: " + (poolStr1 == poolStr2)); // true
        System.out.println("heapStr1 == heapStr2: " + (heapStr1 == heapStr2)); // false
        System.out.println("poolStr1 == heapStr1.intern(): " + (poolStr1 == heapStr1.intern())); // true
    }
}
