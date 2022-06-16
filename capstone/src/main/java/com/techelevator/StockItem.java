package com.techelevator;

import java.math.BigDecimal;

public class StockItem {

    public String itemForSale;
    public BigDecimal itemPrice;
    public Integer numberInStock;
    public String sound;
    MoneyHandler moneyHandler = new MoneyHandler();

    public StockItem() {
        this.numberInStock = 5;
    }

    public StockItem(String itemForSale, BigDecimal itemPrice) {
        this.itemForSale = itemForSale;
        this.itemPrice = itemPrice;
        this.numberInStock = 5;
        this.sound = sound;
    }


    public void dispenseItem() {
        if (getNumberInStock() >= 1) {
            numberInStock--;
            System.out.println(getSound());
        } else{
            System.out.println("SOLD OUT");
        }

    }


    public String getSound() {
        return sound;
    }

    public String getItemForSale() {
        return itemForSale;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }


    public Integer getNumberInStock() {
        return numberInStock;
    }

    // public File getInventoryFile() {
    //   return inventoryFile;
    // }

    public void setItemForSale(String itemForSale) {
        this.itemForSale = itemForSale;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setNumberInStock(Integer numberInStock) {
        this.numberInStock = numberInStock;
    }

}



