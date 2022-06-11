package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class SelectProduct {


    //option 2 on the main menu
    Scanner option2menu = new Scanner(System.in);

    public String option2Menu() {
        try {
            while (true) {
                String input = option2menu.nextLine();
                if (input.equals("1")) { //Feed Money
                    System.out.println("Please feed money $1 at a time.");
                    Scanner moneyInput = new Scanner(System.in);
                    BigDecimal totalBalance = new BigDecimal(String.valueOf(moneyInput));
                } else if (input.equals("2")) { // Select Product
                    System.out.println("Please make your selection: ");
                    Scanner userSelection = new Scanner(System.in);
                    StockItem stockItem = new StockItem();
//                    StockItem.dispenseItem;
                    //move to purchase
                } else if (input.equals("3")) { //Finish Transaction
                    System.out.println("Thank you for playing");
                    // break;//exit transaction
                } else {
                    System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");

                }
            }

        } catch (Exception e) {
            System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");
        }
        return null; //this is a placeholder so it will run. Needs to be moved.
    }
}