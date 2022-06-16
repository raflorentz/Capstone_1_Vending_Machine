package com.techelevator;

import java.math.BigDecimal;
import java.math.BigInteger;
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

        Scanner mainMenuChoice = new Scanner(System.in);
        InventoryReader inventoryReader = new InventoryReader();
        MoneyHandler moneyHandler = new MoneyHandler();
        TransactionLog transactionLog = new TransactionLog();
        SelectProduct selectProduct = new SelectProduct();
        String input;
        String productSelection;
        do {
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");
            input = mainMenuChoice.nextLine();


            if (input.equals("1")) {
                inventoryReader.createStockList();
                for (String eachLine : inventoryReader.createStockList()) {
                    System.out.println(eachLine);
                }
            } else if (input.equals("2")) {
                do {
                    System.out.println("Current Money Provided: " + moneyHandler.getTotalBalance());
                    System.out.println("(1) Feed Money");
                    System.out.println("(2) Select Product");
                    System.out.println("(3) Finish transaction");
                    productSelection = mainMenuChoice.nextLine();
                    if (productSelection.equals("1")) { //Feed Money
                        System.out.println("Please insert whole dollar amounts.");
                        String moneyInput = mainMenuChoice.nextLine();
                        BigDecimal moneyAsBD = new BigDecimal(moneyInput);
                        moneyHandler.depositedMoney(moneyAsBD);
                        String feedMoney = "FEED MONEY";
                        transactionLog.trxLog(feedMoney, moneyAsBD, moneyHandler.getTotalBalance());
                    } else if (productSelection.equals("2")) {
                        System.out.println("Please make your selection: ");
                        if (moneyHandler.getTotalBalance().compareTo(BigDecimal.ZERO) <= 0) {
                            System.out.println("Please insert money before you make your selection.");
                        } else {
                            String userSelection = mainMenuChoice.nextLine(); //changed scanner to string
                            StockItem stockItem = inventoryReader.createDisplayList().get(userSelection);
                            moneyHandler.balanceToReturn(stockItem.getItemPrice());
                            transactionLog.trxLog(stockItem.itemForSale, stockItem.getItemPrice(), moneyHandler.getTotalBalance());
                            stockItem.dispenseItem();
                        }
                    } else if (productSelection.equals("3")) {
                        String giveChange = "GIVE CHANGE";
                        transactionLog.trxLog(giveChange, moneyHandler.getTotalBalance(), BigDecimal.valueOf(0));
                        System.out.println(moneyHandler.refundedMoney(moneyHandler.getTotalBalance()));
                        System.out.println("GAME OVER");
                        break;
                    } else {
                        System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");

                    }
                } while (true);
            } else if (input.equals("3")) {
                moneyHandler.refundedMoney(moneyHandler.getTotalBalance());
                System.out.println("Thank you for playing");
                return;
            } else {
                System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");

            }
        } while (!input.equals("3"));

    }
}



