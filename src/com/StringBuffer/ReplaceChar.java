package com.StringBuffer;

public class ReplaceChar {
    public static void main(String[] args) {
        // Create a new StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Hello World");

        // Replace text between specified start and end positions
        sb.replace(6, 11, "Universe");

        // Print the result
        System.out.println(sb); // Output: Hello Universe
    }
}
