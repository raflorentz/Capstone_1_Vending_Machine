package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StockItems {

    String itemForSale;
    BigDecimal itemPrice;
    String slotIdentifier;
    Integer numberInStock;

    public StockItems(String itemForSale, BigDecimal itemPrice, String slotIdentifier) {
        this.itemForSale = itemForSale;
        this.itemPrice = itemPrice;
        this.slotIdentifier = slotIdentifier; //DON'T NEED THIS HERE.
        this.numberInStock = 5;
    }

    //add method to pull inventory data and update inventory each time a purchase is made.
    //a for loop that decrements the inventory each time one is purchased.
    //When the last item in a stock has been bought, the next attempt should return an Out of Stock error.
    //for (int i = 5; i > 0; i--)


    public String getItemForSale() {
        return itemForSale;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public String getSlotIdentifier() {
        return slotIdentifier;
    }

    public Integer getNumberInStock() {
        return numberInStock;
    }

    public File getInventoryFile() {
        return inventoryFile;
    }

    public void setItemForSale(String itemForSale) {
        this.itemForSale = itemForSale;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setSlotIdentifier(String slotIdentifier) {
        this.slotIdentifier = slotIdentifier;
    }

    public void setNumberInStock(Integer numberInStock) {
        this.numberInStock = numberInStock;
    }

    public void setInventoryFile(File inventoryFile) {
        this.inventoryFile = inventoryFile;
    }
}



