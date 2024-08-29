package com.StringBuffer;

public class AppendText {
    public static void main(String[] args) {
        // Create a new StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Hello");

        // Append text to the existing content
        sb.append(" World");

        // Print the result
        System.out.println(sb); // Output: Hello World
    }
}
