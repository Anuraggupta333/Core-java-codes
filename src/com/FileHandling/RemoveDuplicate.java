package com.FileHandling;

import java.io.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        File inputFile = new File("E:\\", "Input2.txt");
        File outputFile = new File("E:\\", "Output2.txt");

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader2 = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            printWriter = new PrintWriter(new FileWriter(outputFile));

            String line1 = bufferedReader.readLine();
            while (line1 != null) {
                boolean isDuplicate = false;

                // Open bufferedReader2 for checking duplicates
                try {
                    bufferedReader2 = new BufferedReader(new FileReader(outputFile));
                    String line2 = bufferedReader2.readLine();
                    while (line2 != null) {
                        if (line1.equals(line2)) {
                            isDuplicate = true;
                            break;
                        }
                        line2 = bufferedReader2.readLine();
                    }
                } finally {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                if (!isDuplicate) {
                    printWriter.println(line1);
                    printWriter.flush();
                }

                line1 = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}
