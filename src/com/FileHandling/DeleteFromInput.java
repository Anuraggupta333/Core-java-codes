package com.FileHandling;

import java.io.*;

public class DeleteFromInput {
    public static void main(String[] args) {
        // Define file paths
        File inputFile = new File("E:\\", "Input.txt");
        File outputFile = new File("E:\\", "Output.txt");
        File deleteFile = new File("E:\\", "Delete.txt");

        // Use try-with-resources to ensure that resources are closed properly
        try (
                BufferedReader inputReader = new BufferedReader(new FileReader(inputFile));
                PrintWriter outputWriter = new PrintWriter(outputFile)
        ) {
            // Read each line from the input file
            String lineFromInput = inputReader.readLine();

            // Iterate through each line in the input file
            while (lineFromInput != null) {
                boolean shouldDelete = false;

                // Check if the current line should be deleted
                try (BufferedReader deleteReader = new BufferedReader(new FileReader(deleteFile))) {
                    String lineFromDelete = deleteReader.readLine();

                    while (lineFromDelete != null) {
                        if (lineFromInput.equals(lineFromDelete)) {
                            shouldDelete = true;
                            break;
                        }
                        lineFromDelete = deleteReader.readLine();
                    }
                }

                // Write the line to the output file if it is not in the delete file
                if (!shouldDelete) {
                    outputWriter.println(lineFromInput);
                }

                // Read the next line from the input file
                lineFromInput = inputReader.readLine();
            }

        } catch (IOException e) {
            // Handle exceptions and print stack trace
            e.printStackTrace();
        }
    }
}
