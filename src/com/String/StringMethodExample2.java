package com.String;

public class StringMethodExample2 {
    public static void main(String[] args) {
        // Initialize strings for comparison and manipulation
        String s1 = "AnuRag";
        String s4 = "anurag";
        String s2 = new String("anurag"); // Creates a new String object in memory
        String s3 = s1.toLowerCase(); // Converts s1 to lowercase

        // Check if s1 and s3 refer to the same object (false because s1 is not equal to s3)
        System.out.println(s1 == s3); // false

        // Check if the lowercase conversion of s1 equals itself (true because it's comparing identical strings)
        System.out.println(s1.toLowerCase().equals(s1.toLowerCase())); // true

        // Check if lowercase conversion of s1 refers to the same object (false because each call to toLowerCase() creates a new String)
        System.out.println(s1.toLowerCase() == s1.toLowerCase()); // false

        System.out.println("------------------------------------------");

        // Initialize strings for concatenation and comparison
        String a1 = "Anurag";
        String a2 = a1.concat("Gupta"); // Concatenate "Gupta" to "Anurag"
        String a3 = "Gupta";
        String a4 = "Gupta";

        // Check if a2 (result of concatenation) refers to the same object as a4 (false because a2 is a new string)
        System.out.println(a2 == a4); // false

        // Check if a3 and a4 refer to the same object (true because "Gupta" is a string literal and interned)
        System.out.println(a3 == a4); // true

        // Print the length of string a1
        System.out.println(a1.length()); // 6
    }
}
