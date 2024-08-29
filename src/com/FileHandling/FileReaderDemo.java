package com.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        // Initialize FileReader and File objects
        FileReader fileReader = null;
        File file = new File("abc.txt");

        try {
            // Create FileReader object
            fileReader = new FileReader(file);

            // Method 1: Read single character by character
            /*
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            */

            // Method 2: Read entire file into a char array
            char[] charArray = new char[(int) file.length()];
            fileReader.read(charArray);

            // Print the contents of the char array
            for (char c : charArray) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle file I/O exceptions
        } finally {
            // Close FileReader if it was opened
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace(); // Handle exceptions during close
                }
            }
        }
    }
}
