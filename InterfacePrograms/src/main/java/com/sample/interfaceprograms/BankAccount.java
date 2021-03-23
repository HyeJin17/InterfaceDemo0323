package com.sample.interfaceprograms;

public class BankAccount {
    private double balance; //obj.getBalance()
    private int accountNumber; //obj.getAccountNumber()
    private static int lastAssignedNumber=1000; //BankAccount.LastAssignedNumber

    public BankAccount(double balance) {
        this.balance = balance;
        lastAssignedNumber++;
        accountNumber=lastAssignedNumber;
    }

    public double getBalance() {
        return balance;
    }
}