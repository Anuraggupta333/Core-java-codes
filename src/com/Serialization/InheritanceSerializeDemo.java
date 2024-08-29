package com.Serialization;

import java.io.*;

// Base class Animal does not implement Serializable, so its state will not be serialized.
class Animal {
    int i = 10;

    Animal() {
        System.out.println("Animal constructor called");
    }
}

// Elephant class extends Animal and implements Serializable.
class Elephant extends Animal implements Serializable {
    private static final long serialVersionUID = 1L; // Added serialVersionUID for the class
    int j = 0;

    Elephant() {
        System.out.println("Elephant constructor called");
    }
}

public class InheritanceSerializeDemo {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.i = 500;
        elephant.j = 1000;

        System.out.println("Before serialization:");
        System.out.println("i: " + elephant.i + " | j: " + elephant.j);

        // Serialize the object
        try (FileOutputStream fos = new FileOutputStream("elephant.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(elephant);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        Elephant deserializedElephant = null;
        try (FileInputStream fis = new FileInputStream("elephant.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            deserializedElephant = (Elephant) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the values to verify correctness
        if (deserializedElephant != null) {
            System.out.println("After deserialization:");
            System.out.println("i: " + deserializedElephant.i + " | j: " + deserializedElephant.j);
        }
    }
}
