package com.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        // Declare FileWriter
        FileWriter fw = null;

        try {
            // Initialize FileWriter
            fw = new FileWriter("def.txt");

            // Wrap FileWriter with BufferedWriter for efficient writing
            BufferedWriter bw = new BufferedWriter(fw);

            // Write text to the file
            bw.write("Hello, BufferedWriter!");
            bw.newLine();  // Add a new line
            bw.write("This is a test");
            bw.newLine();  // Add another new line

            // Flush the buffer to ensure all data is written to the file
            bw.flush();

            // Write an array of characters to the file
            char[] ch = {'A', 'P', 'P', 'U'};
            bw.write(ch);

            // Close the BufferedWriter to release resources
            bw.close();
        } catch (IOException e) {
            // Handle any IO exceptions
            e.printStackTrace();
        }

        // Note: FileWriter is closed implicitly when BufferedWriter is closed
        // The following code is commented out as it is not needed
        /*
        finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */
    }
}
