package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item, Scanner scanner) {
        item.customize(scanner);
        items.add(item);
    }

    public void saveOrder() {
        // Implement order saving logic here
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}