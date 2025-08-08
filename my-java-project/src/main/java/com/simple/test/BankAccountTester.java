package com.simple.test;

import com.simple.account.*;

public class BankAccountTester {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        BankAccount account = new BankAccount(1, "Jeff Lebowski", 1000f);
        
        manager.setAccount(account);
        
        manager.deposit(400f);
        try {
            manager.withdraw(20f);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Managing " + manager.getAccount());
    }
}