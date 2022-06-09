package com.techelevator;

import java.math.BigDecimal;

public class Gum extends StockItems{

    String sound = "Chew Chew, Yum!";

    public Gum(String itemForSale, BigDecimal itemPrice, String slotIdentifier, Integer numberInStock) {
        super(itemForSale, itemPrice, slotIdentifier, numberInStock);
    }

    public String getSound() {
        return sound;
    }

}
