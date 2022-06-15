package com.techelevator;

import java.math.BigDecimal;
import java.text.Bidi;
import java.util.Calendar;

public class MoneyHandler {
    private BigDecimal totalBalance = new BigDecimal("0.00");
    private BigDecimal amountRefunded;

    private BigDecimal quarter = BigDecimal.valueOf(0.25);
    private BigDecimal dime = BigDecimal.valueOf(0.10);
    private BigDecimal nickel = BigDecimal.valueOf(0.05);


    private BigDecimal currentMoney = new BigDecimal(0);


    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void depositedMoney(BigDecimal amountToDeposit) {
        totalBalance = totalBalance.add(amountToDeposit);
    }

    public void balanceToReturn(BigDecimal itemPrice) {
        this.totalBalance = this.totalBalance.subtract(itemPrice);
    }

    public BigDecimal getCurrentMoney() {
        return currentMoney;
    }


    public String refundedMoney(BigDecimal totalBalance) {
         int totalQuartersInChange = 0;
         int totalDimesInChange = 0;
         int totalNickelsInChange = 0;
        while (totalBalance.compareTo(BigDecimal.ZERO) > 0) {//if totalBalance>0 return 1, if totalBalance ==0 return 0, if totalBalance<0 return -1
            if (totalBalance.compareTo(quarter) >= 0) {
                totalQuartersInChange++;
                totalBalance = totalBalance.subtract(quarter);
            } else if (totalBalance.compareTo(dime) >= 0) {
                totalDimesInChange++;
                totalBalance = totalBalance.subtract(dime);
            } else if (totalBalance.compareTo(nickel) >= 0) {
                totalNickelsInChange++;
                totalBalance = totalBalance.subtract(nickel);
            }
        }
        this.totalBalance = new BigDecimal("0.00");
        String changeMessage = "Now dispensing change: " + totalQuartersInChange + " quarters, " + totalDimesInChange + " dimes, and " + totalNickelsInChange + " nickels";
        return changeMessage;
    }


}
