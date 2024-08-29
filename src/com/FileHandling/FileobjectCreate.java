package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileobjectCreate {
    public static void main(String[] args) {
        // Create a File object representing the file "abc.txt"
        File file = new File("abc.txt");

        // Check if the file exists and print the result
        System.out.println("File exists before creation: " + file.exists());

        try {
            // Attempt to create the file
            boolean fileCreated = file.createNewFile();

            // Print the result of the file creation attempt
            if (fileCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // Handle any IOExceptions that occur during file operations
            System.err.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Check if the file exists after the attempt to create it
        System.out.println("File exists after creation attempt: " + file.exists());
    }
}
