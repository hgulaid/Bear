package com.pluralsight.models;

import java.util.Scanner;

public class Chips extends Item {
    private String type;

    public Chips() {
        super("Chips", 1.50); // Example price
    }

    @Override
    public void customize(Scanner scanner) {
        System.out.println("Select chips type:");
        type = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " (Type: " + type + ")";
    }
}