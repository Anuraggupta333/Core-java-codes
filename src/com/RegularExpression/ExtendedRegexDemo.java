package com.RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtendedRegexDemo {
    public static void main(String[] args) {
        String[] testStrings = {
                "apple",
                "banana",
                "cherry",
                "apricot",
                "bacon",
                "carrot",
                "date",
                "c3po"
        };

        // Define regex patterns
        String regex1 = "^[abc].*"; // Starts with a, b, or c and followed by any characters
        String regex2 = "^[abc]x";  // Starts with a, b, or c and followed by the character 'x'
        String regex3 = "^[abc]\\d+"; // Starts with a, b, or c and followed by one or more digits

        // Compile patterns
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern3 = Pattern.compile(regex3);

        // Check each string against the patterns
        for (String testString : testStrings) {
            Matcher matcher1 = pattern1.matcher(testString);
            Matcher matcher2 = pattern2.matcher(testString);
            Matcher matcher3 = pattern3.matcher(testString);

            if (matcher1.find()) {
                System.out.println(testString + " matches the pattern: " + regex1);
            }
            if (matcher2.find()) {
                System.out.println(testString + " matches the pattern: " + regex2);
            }
            if (matcher3.find()) {
                System.out.println(testString + " matches the pattern: " + regex3);
            }
        }
    }
}
