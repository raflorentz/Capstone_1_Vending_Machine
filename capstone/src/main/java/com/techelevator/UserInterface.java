package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
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



        Scanner mainMenuChoice = new Scanner(System.in);


        try {
            while (true) {
                String input = mainMenuChoice.nextLine();
                if (input.equals("1")) {
                    //break;
                    inventoryReader.createDisplayList();
                    for (StockItem eachLine: inventoryReader.createDisplayList()) {
                        //look up how to access an object within the list
                        System.out.println(eachLine);
                    }
                } else if (input.equals("2")) {
                    System.out.println("you chose 2");
                    //break;
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
}
