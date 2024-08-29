package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        int count = 0;

        // Pattern to match zero or more 'b' characters
        Pattern pattern = Pattern.compile("b*");

        // Create a Matcher object using the pattern and the input string
        Matcher matcher = pattern.matcher("abbabbabbb");

        // Find matches and print them
        while (matcher.find()) {
            // Increment match count
            count++;
            // Print the starting index and matched group
            System.out.println("Found match at index: " + matcher.start() + " ... " + matcher.group());
        }

        // Print the total number of matches found
        System.out.println("Total number of matches: " + count);
    }
}
