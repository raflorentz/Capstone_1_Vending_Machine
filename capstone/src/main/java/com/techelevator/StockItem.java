package com.techelevator;

import java.math.BigDecimal;

public class StockItem {

   public String itemForSale;
    public BigDecimal itemPrice;
    public Integer numberInStock;
     public String sound;

    public StockItem(String itemForSale, BigDecimal itemPrice) {
        this.itemForSale = itemForSale;
        this.itemPrice = itemPrice;
        this.numberInStock = 5;
        this.sound = sound;
    }

    //add method to pull inventory data and update inventory each time a purchase is made.
    //a for loop that decrements the inventory each time one is purchased.
    //When the last item in a stock has been bought, the next attempt should return an Out of Stock error.
    //for (int i = 5; i > 0; i--)


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



