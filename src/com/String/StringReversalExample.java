package com.String;

public class StringReversalExample {
    public static void main(String[] args) {
        // Create a StringBuilder with initial content
        StringBuilder sb = new StringBuilder("Palindrome");

        // Reverse the content of the StringBuilder
        String reversed = sb.reverse().toString();

        // Print the reversed string
        System.out.println("Reversed String: " + reversed); // Output: "emordnilaP"
    }
}
