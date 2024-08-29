package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileSpecificLocation {
    public static void main(String[] args) {
        // Define the file path and name
        File file = new File("E:\\demofile", "Demo.txt");

        try {
            // Attempt to create the file
            boolean fileCreated = file.createNewFile();

            // Print the result of the file creation attempt
            if (fileCreated) {
                System.out.println("File created successfully at: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            // Handle any IOExceptions that occur during file operations
            System.err.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
