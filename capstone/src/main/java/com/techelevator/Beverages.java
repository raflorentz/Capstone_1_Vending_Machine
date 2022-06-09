package com.techelevator;

import java.math.BigDecimal;

public class Beverages extends StockItems{

    String sound = "Glug Glug, Yum!";

    public Beverages(String itemForSale, BigDecimal itemPrice, String slotIdentifier) {
        super(itemForSale, itemPrice, slotIdentifier);
    }

    public String getSound() {
        return sound;
    }
}
