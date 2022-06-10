package com.techelevator;

import java.math.BigDecimal;

public class Chips extends StockItem {

        String sound = "Crunch Crunch, Yum!";

    public Chips(String itemForSale, BigDecimal itemPrice) {
        super(itemForSale, itemPrice);
    }

    public String getSound() {
        return sound;
    }
}
