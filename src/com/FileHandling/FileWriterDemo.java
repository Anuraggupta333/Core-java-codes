package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            // Create a FileWriter object to open the file in append mode
            fileWriter = new FileWriter("abc.txt", true); // Append mode enabled

            // Write various types of data to the file
            fileWriter.write(100); // Writes the integer 100 as the character 'd'
            fileWriter.write("urga\nSoftware Solution"); // Writes the given string
            fileWriter.write("\n"); // Adds a newline character

        } catch (IOException e) {
            // Print stack trace for any IO exceptions
            e.printStackTrace();
        } finally {
            // Ensure the FileWriter is closed to flush data and release resources
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    // Print stack trace for any IO exceptions during closing
                    e.printStackTrace();
                }
            }
        }
    }
}
