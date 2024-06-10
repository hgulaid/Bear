package com.pluralsight.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void saveReceipt(Order order) {
        try {
            File directory = new File("receipts");
            if (!directory.exists()) {
                directory.mkdir();
            }

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
            String filename = "receipts/" + timestamp + ".txt";

            try (FileWriter writer = new FileWriter(filename)) {
                writer.write("Order Details:\n");
                for (AbstractProduct product : order.getProducts()) {
                    writer.write(product.getDescription() + "\n");
                }
                writer.write("Total Cost: $" + order.calculateTotalCost() + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving the receipt.");
        }
    }
}

