package com.Serialization;

import java.io.*;

public class Reciver {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("a.ser");
            ois = new ObjectInputStream(fis);
            Animals obj = (Animals) ois.readObject();
            System.out.println(Animals.i + " .... " + obj.j + " .... " + obj.k);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
