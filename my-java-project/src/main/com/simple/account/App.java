package com.simple.account;

public class App {
    public static void main(String[] args) {
        System.out.println("Testing Bank Accounts:");
        
        BankAccount account1 = new BankAccount(1, "John Doe", 1000.0f);
        BankAccount account2 = new BankAccount(2, "Jane Smith", 500.0f);
        BankAccount account3 = new BankAccount();
        account3.setAccountID(3);
        account3.setOwnerName("Bob Johnson");
        account3.setBalance(750.0f);
        
        System.out.println("\nInitial account states:");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        
        System.out.println("\nTesting deposits:");
        account1.deposit(200.0f);
        account2.deposit(100.0f);
        System.out.println("After deposits: " + account1);
        System.out.println("After deposits: " + account2);
        
        System.out.println("\nTesting withdrawals:");
        try {
            account1.withdraw(300.0f);
            System.out.println("After withdrawal: " + account1);
            
            account2.withdraw(50.0f);
            System.out.println("After withdrawal: " + account2);
            
            account3.withdraw(1000.0f);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nFinal account states:");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}