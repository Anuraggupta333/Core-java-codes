package com.Serialization;

import java.io.*;

// The Account class implements Serializable to support serialization
class Account implements Serializable {
    private static final long serialVersionUID = 1L; // Added serialVersionUID for version control

    String username = "Anurag.gagnil@gmail.com"; // A serializable field
    transient String password = "password123"; // A transient field that won't be serialized directly

    // Custom serialization method
    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject(); // Serialize non-transient fields
        String epwd = "123" + password; // Encrypt or modify the password
        os.writeObject(epwd); // Serialize the modified password
    }

    // Custom deserialization method
    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject(); // Deserialize non-transient fields
        String epwd = (String) is.readObject(); // Deserialize the modified password
        password = epwd.substring(3); // Decrypt or restore the original password
    }
}

public class CustSerializeDemo {
    public static void main(String[] args) {
        Account user1 = new Account(); // Create an instance of Account
        System.out.println("Before Serialization:");
        System.out.println("Username: " + user1.username + " | Password: " + user1.password);

        // Serialize the Account object
        try (FileOutputStream fos = new FileOutputStream("xyz.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(user1); // Write the object to the file
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions during serialization
        }

        // Deserialize the Account object
        try (FileInputStream fis = new FileInputStream("xyz.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Account userser = (Account) ois.readObject(); // Read the object from the file
            System.out.println("After Deserialization:");
            System.out.println("Username: " + userser.username + " | Password: " + userser.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Handle IO and class not found exceptions during deserialization
        }
    }
}
