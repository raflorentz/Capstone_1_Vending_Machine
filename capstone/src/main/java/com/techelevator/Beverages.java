package com.techelevator;

import java.math.BigDecimal;

public class Beverages extends StockItem {

    String sound = "Glug Glug, Yum!";

    public Beverages(String itemForSale, BigDecimal itemPrice) {
        super(itemForSale, itemPrice);
    }

    public String getSound() {
        return sound;
    }
}
