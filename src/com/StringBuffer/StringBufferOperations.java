package com.StringBuffer;
/**
 * Demonstrates various operations using the StringBuffer class.
 */
public class StringBufferOperations {
    public static void main(String[] args) {
        // Create a StringBuffer instance with initial content
        StringBuffer sb = new StringBuffer("anurag");

        // Uncomment the following lines to explore different StringBuffer methods:

        // Append text and other data types to the StringBuffer
       /*  sb.append(" Pi value is : ");
         sb.append(3.14); // Appends the double value 3.14
         sb.append(" It is exactly ");
         sb.append(true); // Appends the boolean value true*/

        // Print the content of the StringBuffer after appending
        // System.out.println(sb);

        // Extract and print a substring from the StringBuffer starting at index 3
        // The substring method returns a new string starting from the specified index
        System.out.println(sb.substring(3)); // Output: "urag"
    }
}
