package com.Serialization;

import java.io.*;

// Serializable class Dog, which contains a reference to a Cat object
class Dog implements Serializable {
    private static final long serialVersionUID = 1L; // Added serialVersionUID for compatibility
    Cat c = new Cat(); // Dog has a Cat, forming an object graph
}

// Serializable class Cat, which contains a reference to a Rat object
class Cat implements Serializable {
    private static final long serialVersionUID = 1L; // Added serialVersionUID for compatibility
    Rat r = new Rat(); // Cat has a Rat, forming an object graph
}

// Serializable class Rat with a simple integer field
class Rat implements Serializable {
    private static final long serialVersionUID = 1L; // Added serialVersionUID for compatibility
    int i = 20; // Field to be serialized
}

public class ObjectGraphDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // Create a new Dog object which will initialize the whole object graph

        // Serialize the Dog object (and its graph)
        try (FileOutputStream fos = new FileOutputStream("def.ser"); // Use .ser extension for serialized data
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(d1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Dog object (and its graph)
        Dog d2 = null;
        try (FileInputStream fis = new FileInputStream("def.ser"); // Use .ser extension for serialized data
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            d2 = (Dog) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the value of 'i' from the deserialized object graph
        if (d2 != null) {
            System.out.println(d2.c.r.i); // Should print '20'
        }
    }
}
