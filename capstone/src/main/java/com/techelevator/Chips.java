package com.techelevator;

import java.math.BigDecimal;

public class Chips extends StockItems{

        String sound = "Crunch Crunch, Yum!";

    public Chips(String itemForSale, BigDecimal itemPrice, String slotIdentifier, Integer numberInStock) {
        super(itemForSale, itemPrice, slotIdentifier, numberInStock);
    }

    public String getSound() {
        return sound;
    }
}
