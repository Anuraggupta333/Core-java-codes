package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharClassDemo {
    public static void main(String[] args) {
        // Define a regex pattern to match a variety of character classes
        // [a-zA-Z0-9\\s\\W] :
        // a-z: matches lowercase letters
        // A-Z: matches uppercase letters
        // 0-9: matches digits
        // \\s: matches whitespace characters (spaces, tabs, etc.)
        // \\W: matches non-word characters (anything that is not a letter, digit, or underscore)
        String regex = "[a-zA-Z0-9\\s\\W]";

        // Compile the pattern into a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to search in the given string
        Matcher m = pattern.matcher("a3b#K@9z!   ");

        // Find and print all matches
        while (m.find()) {
            // m.start() returns the start index of the matched substring
            // m.group() returns the matched substring
            System.out.println("Match at index " + m.start() + ": " + m.group());
        }
    }
}
