package com.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args) {
        Animals d1 = new Animals();

        // Use try-with-resources to automatically close resources
        try (FileOutputStream fos = new FileOutputStream("a.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(d1); // Serialize the Animals object

        } catch (IOException e) {
            // Handle possible IOExceptions
            System.err.println("Error during serialization: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
