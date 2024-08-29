package com.FileHandling;

import java.io.*;

public class ReadAllFiles {
    public static void main(String[] args) {
        // Define the directory and output file paths
        File directory = new File("E:\\Java\\java.io.package");
        File outputFile = new File("alldata.txt");

        // Use try-with-resources to ensure resources are properly closed
        try (
                PrintWriter writer = new PrintWriter(new FileWriter(outputFile))
        ) {
            // List all files in the directory
            String[] files = directory.list();
            if (files == null) {
                System.out.println("Directory does not exist or is not a directory.");
                return;
            }

            // Iterate over each file in the directory
            for (String fileName : files) {
                File file = new File(directory, fileName);

                // Process only files, not directories
                if (file.isFile()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        // Read each line from the current file and write to the output file
                        while ((line = reader.readLine()) != null) {
                            writer.println(line);
                        }
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to output file.");
            e.printStackTrace();
        }
    }
}
