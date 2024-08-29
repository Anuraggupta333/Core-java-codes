package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPrefixDemo {
    public static void main(String[] args) {
        // Define the regex pattern to capture phone numbers with +91 prefix
        String regex = "(\\+91)?(\\d{10})";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to search in the given strings
        String[] testNumbers = {
                "+919876543210",
                "+91987654321",
                "919876543210",
                "+911234567890"
        };

        for (String number : testNumbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.find()) {
                // Extract and print the prefix and the number
                System.out.println("Full number: " + matcher.group());
                System.out.println("Country code: " + matcher.group(1));
                System.out.println("Number: " + matcher.group(2));
            } else {
                System.out.println(number + " does not match the pattern.");
            }
        }
    }
}
