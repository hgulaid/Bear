package com.pluralsight.models;

import java.util.Scanner;

public class Drink extends Item {
    private String size;

    public Drink() {
        super("Drink", 0.0); // The price will be calculated based on customization
    }

    @Override
    public void customize(Scanner scanner) {
        System.out.println("Select drink size (small, medium, large):");
        size = scanner.nextLine();

        // Calculate the price based on the selected size
        switch (size.toLowerCase()) {
            case "small":
                this.price = 2.00;
                break;
            case "medium":
                this.price = 2.50;
                break;
            case "large":
                this.price = 3.00;
                break;
            default:
                this.price = 0.0;
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Size: " + size + ")";
    }
}

