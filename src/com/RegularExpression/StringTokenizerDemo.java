package com.RegularExpression;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        // The string to be tokenized
        String text = "My name is anurag";

        // Create a StringTokenizer object with space as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(text, " ");

        // Iterate over the tokens and print them
        while (tokenizer.hasMoreTokens()) {
            // Retrieve the next token
            String token = tokenizer.nextToken();
            // Print the token
            System.out.println(token);
        }
    }
}
