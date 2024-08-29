package com.FileHandling;

import java.io.File;

public class CountFile {
    public static void main(String[] args) {
        // Specify the directory path
        File directory = new File("E:\\Mobile");
        int fileCount = 0;

        // Check if the specified path is a directory and exists
        if (directory.exists() && directory.isDirectory()) {
            // List all files and directories in the specified directory
            String[] filesAndDirs = directory.list();

            // Check if the directory is not empty
            if (filesAndDirs != null) {
                // Iterate through the files and directories
                for (String item : filesAndDirs) {
                    File file = new File(directory, item);
                    // Check if the item is a file (not a directory)
                    if (file.isFile()) {
                        fileCount++;
                        System.out.println(item);
                    }
                }
            } else {
                System.out.println("The directory is empty or cannot be read.");
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }

        // Print the total number of files
        System.out.println("Number of files in the directory: " + fileCount);
    }
}
