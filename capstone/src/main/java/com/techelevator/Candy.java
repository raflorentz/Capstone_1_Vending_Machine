package com.techelevator;

import java.math.BigDecimal;

public class Candy extends StockItems{

    String sound = "Munch Munch, Yum!";

    public Candy(String itemForSale, BigDecimal itemPrice, String slotIdentifier, Integer numberInStock) {
        super(itemForSale, itemPrice, slotIdentifier, numberInStock);
    }

    public String getSound() {
        return sound;
    }
}
