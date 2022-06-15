package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TransactionLog {


    FileOutputStream fos;
    Scanner logInput = new Scanner(System.in);
    File logFile = new File("Log.txt");

    public void trxLog (String interactionType, BigDecimal interactionBalance, BigDecimal newBalance){
        try {
            fos = new FileOutputStream(logFile, true);
            PrintWriter logWriter = new PrintWriter(fos);
            logWriter.printf("%s %s %s %s \n", dateForLog, interactionType, interactionBalance, newBalance);
            logWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm:ss a");
        String dateForLog = date.format(formatter);
    }
