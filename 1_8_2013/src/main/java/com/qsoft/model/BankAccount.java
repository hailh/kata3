package com.qsoft.model;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 8/1/13
 * Time: 9:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {
    private String accountNumber;
    private long timestamp;
    private long balance;

    public BankAccount(String accountNumber, long balance, long timestamp) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.timestamp = timestamp;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
