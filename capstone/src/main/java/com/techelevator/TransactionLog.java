package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TransactionLog {

    File logFile = new File("Log.txt");
    FileOutputStream fos = new FileOutputStream(logFile, true);

    private String formatDateOutput() {
        String dateTime = LocalDateTime.now(DateTimeFormatter.ofPattern("MM dd yyyy h:m:s a")); //whyyyyyyy
        return dateTime;
    }


    public TransactionLog() throws FileNotFoundException { //tiffany pls to halping.
    }
}
