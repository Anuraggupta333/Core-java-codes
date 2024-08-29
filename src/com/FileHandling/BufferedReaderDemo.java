package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        // Declare the BufferedReader variable
        BufferedReader br = null;

        try {
            // Create FileReader object to read the file
            FileReader fr = new FileReader("def.txt");

            // Wrap FileReader with BufferedReader for efficient reading
            br = new BufferedReader(fr);

            // Read and print each line from the file
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Print exception details if any error occurs
            e.printStackTrace();
        } finally {
            // Close BufferedReader to release resources
            // This block will always execute whether an exception occurs or not
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
