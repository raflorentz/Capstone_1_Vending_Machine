package com.techelevator;

import java.util.Scanner;

public class SelectProduct {


    //option 2 on the main menu
    Scanner option2menu = new Scanner(System.in);

    public String option2Menu() {
        try {
            while (true) {
                String input = option2menu.nextLine();
                if (input.equals("1")) {
                    //break;
                    inventoryReader.createStockList();
                    for (String eachLine : inventoryReader.createStockList()) {
                        System.out.println(eachLine);

                    }
                } else if (input.equals("2")) {
                    System.out.println("Enter Slot ID");

                    //move to purchase
                } else if (input.equals("3")) {
                    System.out.println("Thank you for playing");
                    // break;//exit transaction
                } else {
                    System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");

                }
            }

        } catch (Exception e) {
            System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");
        }
    }