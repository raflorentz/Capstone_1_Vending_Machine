package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TransactionLog {


    File logFile = new File("Log.txt");
    FileOutputStream fos;

    {
        try {
            fos = new FileOutputStream(logFile, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String formatDateOutput() {
        String dateTime = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(new Date());
        return dateTime;
    }

  }
