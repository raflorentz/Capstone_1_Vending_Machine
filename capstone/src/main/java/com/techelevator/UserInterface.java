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
            }

            else if (input.equals("2")) {
                    do {
                    System.out.println("Current Money Provided: " + moneyHandler.getTotalBalance()); //this will now print the balance to the screen.
                    System.out.println("(1) Feed Money");
                    System.out.println("(2) Select Product");
                    System.out.println("(3) Finish transaction");
                    productSelection = mainMenuChoice.nextLine();
                    if (productSelection.equals("1")) { //Feed Money
                        System.out.println("Please insert whole dollar amounts.");
                        String moneyInput = mainMenuChoice.nextLine(); //multiple scanners can't be going at a time, so we changed this to a String
                        BigDecimal moneyAsBD = new BigDecimal(moneyInput);
                        moneyHandler.depositedMoney(moneyAsBD);
                        String feedMoney = "FEED MONEY";
                        transactionLog.trxLog(feedMoney, moneyAsBD, moneyHandler.getTotalBalance());
                    } else if (productSelection.equals("2")) { // Select Product
                        System.out.println("Please make your selection: ");
                        String userSelection = mainMenuChoice.nextLine(); //changed scanner to string
                        StockItem stockItem = inventoryReader.createDisplayList().get(userSelection);
                        moneyHandler.balanceToReturn(stockItem.getItemPrice());
                        transactionLog.trxLog(stockItem.itemForSale, stockItem.getItemPrice(), moneyHandler.getTotalBalance());
                        stockItem.dispenseItem();
                        String slotChoice = mainMenuChoice.nextLine();
                    } else if (productSelection.equals("3")) { //Finish Transaction
                        String giveChange = "GIVE CHANGE";
                        transactionLog.trxLog(giveChange, moneyHandler.getTotalBalance(), BigDecimal.valueOf(0));
                        System.out.println(moneyHandler.refundedMoney(moneyHandler.getTotalBalance()));
                        System.out.println("GAME OVER");
                            break;
                    } else {
                        System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");

                    }
                    //move to purchase
                }while (true);
            }

            else if (input.equals("3")) {
                moneyHandler.refundedMoney(moneyHandler.getTotalBalance());
                System.out.println("Thank you for playing");
                return;
            } else {
                System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");

            }
        } while (!input.equals("3"));


//    public static void option2Menu() {
//        try {
//           Scanner menu2 = new Scanner(System.in);
//
//            while (true) {
//                String input = menu2.nextLine();
//
//                System.out.println("Current Money Provided: ");
//                System.out.println("(1) Feed Money");
//                System.out.println("(2) Select Product");
//                System.out.println("(3) Finish transaction");
//                if (input.equals("1")) { //Feed Money
//                    System.out.println("Please insert whole dollar amounts.");
//                    Scanner moneyInput = new Scanner(System.in);
//                    BigDecimal totalBalance = new BigDecimal(String.valueOf(moneyInput));
//                } else if (input.equals("2")) { // Select Product
//                    System.out.println("Please make your selection: ");
//                    Scanner userSelection = new Scanner(System.in);
//                    StockItem stockItem = new StockItem();
////                    StockItem.dispenseItem;
//                    //move to purchase
//                } else if (input.equals("3")) { //Finish Transaction
//                    System.out.println("Thank you for playing");
//                    // break;//exit transaction
//                } else {
//                    System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");
//
//                }
//            }

        //      } catch (Exception e) {
        //         System.out.println("ugh...this again?? select a NUMBER, 1, 2 or 3.");
        //      }
        //       return;
        //   }
    }}



