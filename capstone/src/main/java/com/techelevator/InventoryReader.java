package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryReader {

    private File inventoryFile = new File("vendingmachine.csv");

    private List<String> createStockList() {
        List<String> stockList = new ArrayList<String>();
        try (Scanner fileImporter = new Scanner(inventoryFile)) {
            while (fileImporter.hasNextLine()) {
                stockList.add(fileImporter.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Give me a real file....");
        }
        return stockList;
    }

    public List<StockItem> createDisplayList() {
        List<StockItem> displayList = new ArrayList<>();
        for (String itemListing : createStockList()) {
            String[] vendItem = itemListing.split("\\|");

            String slotID = vendItem[0];
            String itemForSale = vendItem[1];
            BigDecimal itemPrice = new BigDecimal(vendItem[2]);
            String category = vendItem[3];


            if (category.equals("Chip")) {
                Chips chips = new Chips(itemForSale, itemPrice);
                displayList.add(chips);
            } else if (category.equals("Drink")) {
                Beverages beverages = new Beverages(itemForSale, itemPrice);
                displayList.add(beverages);
            } else if (category.equals("Gum")) {
                Gum gum = new Gum(itemForSale, itemPrice);
                displayList.add(gum);
            } else if (category.equals("Candy")) {
                Candy candy = new Candy(itemForSale, itemPrice);
                displayList.add(candy);

            }
        }

        return displayList;
    }
}