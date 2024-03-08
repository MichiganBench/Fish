package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<String> itemNames;
    private List<Integer> itemQuantities;

    public Stock() {
        itemNames = new ArrayList<>();
        itemQuantities = new ArrayList<>();
    }

    public void addItem(String name, int quantity) {
        itemNames.add(name);
        itemQuantities.add(quantity);
    }

    public void displayStock() {
        System.out.println("Available instruments in stock:");
        for (int i = 0; i < itemNames.size(); i++) {
            System.out.printf("%s - Quantity: %d\n", itemNames.get(i), itemQuantities.get(i));
        }
    }
}