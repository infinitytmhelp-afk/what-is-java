package com.madeeasy.topic02;

// encapsulated

/**
 * Rule:
 * a. variable = private
 * b. methods = public
 */

public class BankAccount {
    private double balance;

    BankAccount(double openingBalance) {
        balance = openingBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    double getBalance() {
        return balance;
    }
}
