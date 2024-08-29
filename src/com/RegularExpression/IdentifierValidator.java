package com.RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IdentifierValidator {
    public static void main(String[] args) {
        // Define the regex pattern for Java identifiers
        String regex = "^[a-zA-Z_$][a-zA-Z_$0-9]*$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Sample identifiers to validate
        String[] identifiers = {
                "myVariable",
                "_myVariable",
                "$myVariable",
                "myVariable1",
                "1myVariable",    // Invalid
                "my-Variable",    // Invalid
                "public",         // Valid but a reserved keyword
                "class"           // Valid but a reserved keyword
        };

        // Validate each identifier
        for (String identifier : identifiers) {
            Matcher matcher = pattern.matcher(identifier);
            if (matcher.matches()) {
                System.out.println(identifier + " is a valid Java identifier.");
            } else {
                System.out.println(identifier + " is not a valid Java identifier.");
            }
        }
    }
}
