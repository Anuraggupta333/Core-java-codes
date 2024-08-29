package com.String;

public class StringInternExample {
    public static void main(String[] args) {
        // Create a string literal
        String literalString = "Java";

        // Create a new String object with the same content
        String newString = new String("Java");

        // Use intern() to get the pooled reference
        String internedString = newString.intern();

        // Compare the references
        System.out.println("literalString == internedString: " + (literalString == internedString)); // true

        // Compare with the original newString
        System.out.println("newString == internedString: " + (newString == internedString)); // false
    }
}

