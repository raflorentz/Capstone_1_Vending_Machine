package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;


public class UserInterface {

    public static void main(String[] args) {

        System.out.println("                           I'm a machine that vends stuff, dude. What do you want from me?");
        System.out.println("                                               ------------------------");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               |   0       0      0    |");
        System.out.println("                                               =========================");
        System.out.println("                                               | ==============   []   |");
        System.out.println("                                               | ==============        |");
        System.out.println("                                               |_______________________|");
        System.out.println("                                               ||                     ||");

        System.out.println("                                     I don't have all day, make a decision already..");
        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
        InventoryReader inventoryReader = new InventoryReader();
        MoneyHandler moneyHandler = new MoneyHandler();


        Scanner mainMenuChoice = new Scanner(System.in);
        SelectProduct selectProduct = new SelectProduct();

            try {
            while (true) {
                String input = mainMenuChoice.nextLine();
                if (input.equals("1")) {
                    //break;
                    inventoryReader.createStockList();
                    for (String eachLine: inventoryReader.createStockList()) {
                        System.out.println(eachLine);

                    }
                } else if (input.equals("2")) {
                UserInterface.option2Menu();

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


    public static void option2Menu() {
        try {
           Scanner menu2 = new Scanner(System.in);

            while (true) {
                String input = menu2.nextLine();

                System.out.println("Current Money Provided: ");
                System.out.println("(1) Feed Money");
                System.out.println("(2) Select Product");
                System.out.println("(3) Finish transaction");
                if (input.equals("1")) { //Feed Money
                    System.out.println("Please insert whole dollar amounts.");
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
        return;
    }
}



