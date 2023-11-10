package com.jls;

public class BankAccount {

    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    //Method to deposit monet into the account
    public void deposit(double amount){
        synchronized (this) {
            System.out.println("Thread" + Thread.currentThread().getId() + "starts depositing");
            balance += amount;
            System.out.println("Thread" + Thread.currentThread().getId() + "ends depositing");
        }
    }

    public double getBalance() {
        return balance;
    }
}
