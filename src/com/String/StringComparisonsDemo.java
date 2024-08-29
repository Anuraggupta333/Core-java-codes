package com.String;

/**
 * Demonstrates various string creation and comparison scenarios.
 */
public class StringComparisonsDemo {

    public static void main(String[] args) {
        // Uncomment the following lines to analyze each case:

        // 1. Comparing two new String objects
        // String s1 = new String("you can not change me");
        // String s2 = new String("you can not change me");
        // System.out.println(s1 == s2); // false

        // 2. Comparing string literal with a new String object
        // String s3 = "you can not change me";
        // System.out.println(s1 == s3); // false

        // 3. Comparing two string literals
        // String s4 = "you can not change me";
        // System.out.println(s3 == s4); // true

        // 4. Comparing concatenated literals
        // String s5 = "you can not" + " change me";
        // System.out.println(s4 == s5); // true

        // 5. Comparing a concatenated runtime expression with a literal
        // String s6 = "you can not";
        // String s7 = s6 + " change me"; // concatenated at runtime, stored in heap
        // System.out.println(s4 == s7); // false

        // 6. Comparing concatenated compile-time constant with a literal
        // final String s8 = "you can not";
        // String s9 = s8 + " change me"; // compile-time constant, stored in SCP
        // System.out.println(s4 == s9); // true

        // Print all strings
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(s5);
        // System.out.println(s7);
        // System.out.println(s9);

        // New code block for analysis
        String s10 = new String("Anurag"); // Creates a new String object
        // String s10 = "Anurag"; // Uncomment this line to test if `s10` is the same as `s12` for true
        String s11 = s10.toString(); // Returns the same object reference as s10
        String s12 = "Anurag"; // String literal
        // String s13 = new String("ANURAG"); // Creates a new String object with different content
        String s13 = "ANURAG"; // String literal

        String s14 = s12.toUpperCase(); // Creates a new String object with "ANURAG"

        // Comparing string literals
        System.out.println(s13 == s14); // false, different references (different content)

        // Comparing new String object with its toString result
        System.out.println(s10 == s11); // true, same reference

        // Comparing String literal with its toString result
        System.out.println(s11 == s12); // false, different references (new object vs. literal)
    }
}
