package com.RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        // Regular expression pattern to match sequences of digits
        String pattern = "\\d+"; // Matches one or more digits

        // Compile the pattern into a Pattern object
        Pattern compiledPattern = Pattern.compile(pattern);

        // Create a Matcher object to find matches in the input string
        Matcher matcher = compiledPattern.matcher("There are 123 apples and 456 oranges.");

        // Find and print all sequences of digits in the input string
        while (matcher.find()) {
            // Print each matched sequence of digits
            System.out.println("Found number: " + matcher.group());
        }
    }
}
