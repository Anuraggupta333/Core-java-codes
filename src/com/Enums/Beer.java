package com.Enums;

public enum Beer {
    KingFisher(120),
    Budweiser(140),
    Miller(250),
    StellaArtois; // No price provided, should use default

    private int price;

    // Constructor for beers with a specified price
    private Beer(int price) {
        this.price = price;
    }

    // Default constructor for beers without a specified price
    private Beer() {
        this.price = 100; // Default price
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // Retrieve all enum constants
        Beer[] beerNames = Beer.values();

        // Print the name and price of each beer
        for (Beer beer : beerNames) {
            System.out.println(beer + " - " + beer.getPrice());
        }
        // Print the price of KingFisher
        System.out.println("KingFisher price: " + KingFisher.getPrice());
    }
}
