package com.String;

public class StringMethodExample3 {
    public static void main(String[] args) {
        // Initialize a string literal
        String s = "Anurag";

        // Create a new String object with the same content
        String s2 = new String("Anurag");

        // Concatenate an empty string to s2, which will result in a new string
        String s1 = s2.concat("");

        // Check if s and s2 refer to the same object (false because s2 was created with 'new' keyword)
        System.out.println(s == s2); // false

        //If there is no change in String then it point the same string then its true
        System.out.println(s1 == s2); // true

        // Print the value of s (which is "Anurag")
        System.out.println(s); // Anurag
    }
}
