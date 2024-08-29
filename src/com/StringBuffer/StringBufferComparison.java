package com.StringBuffer;

public class StringBufferComparison {
    public static void main(String[] args) {
        // Create two different StringBuffer objects with the same content
        StringBuffer sb1 = new StringBuffer("Hello World");
        StringBuffer sb2 = new StringBuffer("Hello World");

        // Compare the two StringBuffer objects using '=='
        System.out.println("sb1 == sb2: " + (sb1 == sb2)); // Output: false

        // Compare the two StringBuffer objects using 'equals'
        // Note: StringBuffer does not override the equals method, so it will default to Object's equals method
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2)); // Output: false
    }
}
