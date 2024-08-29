package com.RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StartEndRegexDemo {
    public static void main(String[] args) {
        String[] testStrings = {
                "abcy",
                "abc123y",
                "abcxy",
                "abcy",
                "abc",
                "yabc",
                "abcyx",
                "abbbbby"
        };

        String regex = "^abc.*y$"; // Starts with abc and ends with y

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Check each string against the pattern
        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            if (matcher.matches()) {
                System.out.println(testString + " matches the pattern.");
            } else {
                System.out.println(testString + " does not match the pattern.");
            }
        }
    }
}
