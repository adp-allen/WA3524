package com.simple.account;

public class BankAccount implements Account {
    private int accountID;
    private String ownerName;
    private float balance;
    
    public BankAccount() {
    }
    
    public BankAccount(int accountID, String ownerName, float balance) {
        this.accountID = accountID;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    public int getAccountID() {
        return accountID;
    }
    
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public float getBalance() {
        return balance;
    }
    
    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public void deposit(float amount) {
        this.balance = this.balance + amount;
    }
    
    public void withdraw(float amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Amount " + amount + 
                " exceeds balance " + this.balance);
        }
        this.balance = this.balance - amount;
    }
    
    public String toString() {
        return "An account with id " + this.accountID + 
               " with balance " + this.balance + 
               " owned by " + this.ownerName;
    }
}