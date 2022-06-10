package com.techelevator;

import java.math.BigDecimal;
import java.text.Bidi;
import java.util.Calendar;

public class MoneyHandler {
    private BigDecimal totalBalance = new BigDecimal("0.00");
    private BigDecimal transactionTotal;
    private BigDecimal change;
    private BigDecimal amountRefunded;

    private BigDecimal quarter = BigDecimal.valueOf(0.25);
    private BigDecimal dime = BigDecimal.valueOf(0.10);
    private BigDecimal nickel = BigDecimal.valueOf(0.05);

    private int totalQuartersInChange = 0;
    private int totalDimesInChange = 0;
    private int totalNickelsInChange = 0;



    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void depositedMoney(BigDecimal amountToDeposit) {
        totalBalance = totalBalance.add(amountToDeposit);
    }

    public void refundedMoney() {
        BigDecimal amountRefunded = totalBalance.subtract(transactionTotal);
    }

    public String makeChange(BigDecimal totalBalance){
        BigDecimal calculator = totalBalance;

        while (calculator.compareTo(BigDecimal.ZERO) > 0) {
            if (calculator.compareTo(quarter) >= 0) {
                totalQuartersInChange++;
                calculator = calculator.subtract(quarter);
            } else if (calculator.compareTo(dime) >= 0) {
                totalDimesInChange++;
                calculator = calculator.subtract(dime);
            } else if (calculator.compareTo(nickel) >= 0) {
                totalNickelsInChange++;
                calculator = calculator.subtract(nickel);
            }
        } this.totalBalance = new BigDecimal("0.00");
        String changeMessage = ("Now dispensing change: " + totalQuartersInChange + " quarters, " + totalDimesInChange + " dimes, and " + totalNickelsInChange + " nickels");
        return changeMessage;
    }

}
