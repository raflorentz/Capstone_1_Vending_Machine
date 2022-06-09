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
        Scanner mainMenuChoice = new Scanner(System.in);
        mainMenuChoice.nextLine();

        while (true) {
            if (mainMenuChoice.equals("1")) {
                //call stockList
            } else if (mainMenuChoice.equals("2")) {
                //move to purchase
            } else if (mainMenuChoice.equals("3")) {
                //exit transaction
            } else {
                System.out.println("Invalid option selected. Please use a number to select your option");
                continue;
            }


        }

    }
}
