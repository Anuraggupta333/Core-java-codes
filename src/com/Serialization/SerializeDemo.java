package com.Serialization;

import java.io.*;

// Define a class that implements Serializable to allow its instances to be serialized
class Animals implements Serializable {
    // Fields of the class
    private static final long serialVersionUID = 1L;
    static int i = 10;
    int j = 20;
    int k =30;
}

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        // Create an instance of the Animals class
        Animals dog = new Animals();

        // Create a FileOutputStream to write data to a file
        FileOutputStream fos = new FileOutputStream("abc.txt");

        // Wrap the FileOutputStream with an ObjectOutputStream to serialize objects
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Write the Animals object to the file
        oos.writeObject(dog);

        // Close the ObjectOutputStream
        oos.close();

        // Close the FileOutputStream
        fos.close();

        // Create a FileInputStream to read data from the file
        FileInputStream fis = new FileInputStream("abc.txt");

        // Wrap the FileInputStream with an ObjectInputStream to deserialize objects
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Read the Animals object from the file
        Animals readDog = (Animals) ois.readObject();

        // Close the ObjectInputStream
        ois.close();

        // Close the FileInputStream
        fis.close();

        // Print the values of the fields of the deserialized Animals object
        System.out.println(readDog.i + ".................." + readDog.j);
    }
}
