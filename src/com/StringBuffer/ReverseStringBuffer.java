package com.StringBuffer;

public class ReverseStringBuffer {
    public static void main(String[] args) {
        // Create a new StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Hello");

        // Reverse the content of the StringBuffer
        sb.reverse();

        // Print the result
        System.out.println(sb); // Output: olleH
    }
}
