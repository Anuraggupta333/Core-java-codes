package com.StringBuffer;

public class StringToStringBuffer {
    public static void main(String[] args) {
        // Create a new StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Hello World");

        // Convert StringBuffer to String
        String str = sb.toString();

        // Print the result
        System.out.println(str); // Output: Hello World
    }
}
