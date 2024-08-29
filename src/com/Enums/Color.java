package com.Enums;

public enum Color {
    GREEN,
    RED {
        @Override
        void info() {
            System.out.println("Dangerous Color");
        }
    },
    BLUE;

    // Default implementation of info() method
    void info() {
        System.out.println("Safe Color");
    }

    public static void main(String[] args) {
        // Retrieve all enum constants
        Color[] colors = Color.values();

        // Iterate over each enum constant and print information
        for (Color color : colors) {
            System.out.print(color + " : ");
            color.info(); // Call info() method without concatenation
            System.out.println(" : " + color.ordinal());
        }
    }
}
