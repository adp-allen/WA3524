package com.simple.account;

public class AccountManager {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void deposit(float amount) {
        this.getAccount().deposit(amount);
    }

    public void withdraw(float amount) throws InsufficientFundsException {
        this.getAccount().withdraw(amount);
    }
}