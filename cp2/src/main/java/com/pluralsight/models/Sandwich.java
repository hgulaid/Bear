package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich extends Item {
    private String bread;
    private int size;
    private boolean toasted;
    private List<String> meats = new ArrayList<>();
    private List<String> cheeses = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();

    public Sandwich() {
        super("Sandwich", 0.0);
    }

    @Override
    public void customize(Scanner scanner) {
        System.out.println("Select your bread (white, wheat, rye, wrap):");
        bread = scanner.nextLine();

        System.out.println("Select sandwich size (4, 8, 12):");
        size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Would you like the sandwich toasted? (yes/no):");
        toasted = scanner.nextLine().equalsIgnoreCase("yes");

        // Add logic to select meats, cheeses, toppings, sauces

        // Example:
        System.out.println("Select meats (comma separated):");
        String[] meatsArray = scanner.nextLine().split(",");
        for (String meat : meatsArray) {
            meats.add(meat.trim());
        }

        calculatePrice();
    }

    private void calculatePrice() {
        double basePrice = 0;
        switch (size) {
            case 4:
                basePrice = 5.50;
                break;
            case 8:
                basePrice = 7.00;
                break;
            case 12:
                basePrice = 8.50;
                break;
        }

        double meatPrice = meats.size() * 1.00;
        double cheesePrice = cheeses.size() * 0.75;

        this.price = basePrice + meatPrice + cheesePrice;
    }

    @Override
    public String toString() {
        return super.toString() + " (Bread: " + bread + ", Size: " + size + "\", Toasted: " + toasted +
                ", Meats: " + meats + ", Cheeses: " + cheeses +
                ", Toppings: " + toppings + ", Sauces: " + sauces + ")";
    }
}

