package com.StringBuffer;

public class DeleteChar {
    public static void main(String[] args) {
        // Create a new StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Hello Universe");

        // Delete text between specified start and end positions
        sb.delete(6, 15);

        // Print the result
        System.out.println(sb); // Output: Hello
    }
}
