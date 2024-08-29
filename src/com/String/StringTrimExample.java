package com.String;
public class StringTrimExample {
    public static void main(String[] args) {
        // Initialize a String variable with leading and trailing spaces
        String s1 = " Hello world";

        // Remove leading and trailing spaces from the String
        s1 = s1.trim();

        // Print the index of the first occurrence of a space character
        // After trimming, the string is "Hello world", so the space is at index 5
        System.out.println(s1.indexOf(" "));
    }
}
