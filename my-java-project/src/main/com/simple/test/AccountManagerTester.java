package com.simple.test;

import com.simple.account.*;

public class AccountManagerTester {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        BusinessAccount account = new BusinessAccount(1000f, 1, "SimpleCorp", "123 Fake Street");
        
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