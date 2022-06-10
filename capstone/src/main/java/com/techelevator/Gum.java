package com.techelevator;

import java.math.BigDecimal;

public class Gum extends StockItem {

    String sound = "Chew Chew, Yum!";

    public Gum(String itemForSale, BigDecimal itemPrice) {
        super(itemForSale, itemPrice);
    }

    public String getSound() {
        return sound;
    }

}
