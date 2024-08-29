package com.Serialization;

import java.io.*;

// Serializable class with both instance and static variables
class SerializableEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private int instanceVariable;
    private static int staticVariable = 100; // Static variable

    // Constructor
    public SerializableEntity(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Custom serialization: Serialize instance variables
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // Serialize instance variables
        // Static variables are not serialized
    }

    // Custom deserialization: Deserialize instance variables
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Deserialize instance variables
        // Static variables are not affected by deserialization
    }

    // Methods to set and get the static variable
    public static void setStaticVariable(int value) {
        staticVariable = value;
    }

    public static int getStaticVariable() {
        return staticVariable;
    }

    @Override
    public String toString() {
        return "SerializableEntity [instanceVariable=" + instanceVariable + ", staticVariable=" + staticVariable + "]";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Set the static variable
            SerializableEntity.setStaticVariable(200);

            // Serialize the object
            SerializableEntity obj = new SerializableEntity(50);
            try (FileOutputStream fos = new FileOutputStream("serializable_entity.ser");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(obj);
            }

            // Change the static variable
            SerializableEntity.setStaticVariable(300);

            // Deserialize the object
            SerializableEntity deserializedObj;
            try (FileInputStream fis = new FileInputStream("serializable_entity.ser");
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                deserializedObj = (SerializableEntity) ois.readObject();

            }

            // Print the deserialized object and the static variable
            System.out.println("Deserialized Object: " + deserializedObj);
            System.out.println("Static Variable after deserialization: " + SerializableEntity.getStaticVariable());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
