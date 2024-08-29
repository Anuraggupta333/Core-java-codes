package com.Serialization;

import java.io.*;

// The Mobile class implements Externalizable for custom serialization and deserialization.
class Mobile implements Externalizable {
    private static final long serialVersionUID = 1L; // Added serialVersionUID for Externalizable class

    int i = 0;
    int j = 1;
    int k = 2;

    // Default constructor is required for Externalizable.
    public Mobile() {}

    // Custom constructor to initialize fields.
    public Mobile(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    // Write the object's state to the stream.
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(i);
        out.writeInt(j);
        out.writeInt(k);
    }

    // Read the object's state from the stream.
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        i = in.readInt();
        j = in.readInt();
        k = in.readInt(); // Ensure that all fields are read from the stream.
    }
}

public class ExternalizationDemo {

    public static void main(String[] args) {
        Mobile nokia = new Mobile(10, 20, 30);

        // Serialize the object
        try (FileOutputStream fos = new FileOutputStream("fgh.ser"); // Use .ser extension for serialized files
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(nokia);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        Mobile readMobile = null;
        try (FileInputStream fis = new FileInputStream("fgh.ser"); // Use .ser extension for serialized files
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            readMobile = (Mobile) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the values to verify correctness
        if (readMobile != null) {
            System.out.println("Deserialized Mobile object:");
            System.out.println("i: " + readMobile.i + " | j: " + readMobile.j + " | k: " + readMobile.k);
        }
    }
}
