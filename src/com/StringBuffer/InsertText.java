package com.StringBuffer;

public class InsertText {
    public static void main(String[] args) {
        // Create a new StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Hello World");

        // Insert text at a specific position
        sb.insert(6, "Beautiful ");

        // Print the result
        System.out.println(sb); // Output: Hello Beautiful World
    }
}

