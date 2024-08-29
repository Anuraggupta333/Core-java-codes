package com.FileHandling;

import java.io.*;

public class Merge2File {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        BufferedReader reader1 = null;

        try {
            // Initialize PrintWriter to write to "xyz.txt"
            printWriter = new PrintWriter("xyz.txt");

            // Merge contents from "def.txt"
            try {
                reader1 = new BufferedReader(new FileReader("def.txt"));
                String line = reader1.readLine();
                while (line != null) {
                    printWriter.println(line);
                    line = reader1.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Ensure reader1 is closed after reading "def.txt"
                if (reader1 != null) {
                    try {
                        reader1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            // Merge contents from "ghi.txt"
            try {
                reader1 = new BufferedReader(new FileReader("ghi.txt"));
                String line = reader1.readLine();
                while (line != null) {
                    printWriter.println(line);
                    line = reader1.readLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                // Ensure reader1 is closed after reading "ghi.txt"
                if (reader1 != null) {
                    try {
                        reader1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Ensure PrintWriter is closed
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}

//*********************************************Best practice *******************************************************
/*import java.io.*;

public class Merge2File {
    public static void main(String[] args) {
        // List of files to be merged
        String[] inputFiles = {"def.txt", "ghi.txt"};
        String outputFile = "xyz.txt";

        // Use try-with-resources to automatically close resources
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(outputFile))) {
            for (String inputFile : inputFiles) {
                mergeFileContents(inputFile, printWriter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mergeFileContents(String inputFile, PrintWriter printWriter) {
        // Use try-with-resources to automatically close BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                printWriter.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/

//**************************************** If file is not available *******************************************
/*
import java.io.*;

public class Merge2File {

    public static void main(String[] args) {
        // Merge contents of "def.txt" and "ghi.txt" into "xyz.txt"
        mergeFiles("def.txt", "ghi.txt", "xyz.txt");
    }

    private static void mergeFiles(String file1, String file2, String outputFile) {
        try (
                // Initialize PrintWriter to write to "xyz.txt" in append mode
                PrintWriter printWriter = new PrintWriter(new FileWriter(outputFile, true))
        ) {
            // Process the first file
            processFile(file1, printWriter);

            // Process the second file
            processFile(file2, printWriter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processFile(String fileName, PrintWriter printWriter) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File " + fileName + " created successfully.");
                } else {
                    System.out.println("File " + fileName + " already exists.");
                }
            } catch (IOException e) {
                System.err.println("Error creating file " + fileName + ": " + e.getMessage());
                return;
            }
        }

        try (
                // Use BufferedReader to read from the file
                BufferedReader reader = new BufferedReader(new FileReader(file))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                printWriter.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        }
    }
}
*/
