package com.RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MobileNumberValidator {
    public static void main(String[] args) {
        String[] testNumbers = {
                "9876543210",
                "919876543210",
                "+91 9876543210",
                "+91-9876543210",
                "987-654-3210",
                "+91 987 654 3210",
                "0876543210", // Invalid
                "1987654321", // Invalid
                "987654321"   // Invalid
        };

        // Regex pattern to match Indian mobile numbers
        String regex = "^([789]\\d{9})$|^\\+91[789]\\d{9}$|^\\+91[\\s-]?[789]\\d{9}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Check each number against the pattern
        for (String number : testNumbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.matches()) {
                System.out.println(number + " is a valid Indian mobile number.");
            } else {
                System.out.println(number + " is not a valid Indian mobile number.");
            }
        }
    }
}
