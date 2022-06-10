package com.techelevator;

import java.math.BigDecimal;

public class Candy extends StockItem {

    String sound = "Munch Munch, Yum!";

    public Candy(String itemForSale, BigDecimal itemPrice) {
        super(itemForSale, itemPrice);
    }

    public String getSound() {
        return sound;
    }
}
