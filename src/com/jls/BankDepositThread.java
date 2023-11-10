package com.jls;

public class BankDepositThread extends Thread{
    private BankAccount account;
    private double balance;

    public BankDepositThread(BankAccount account, double balance){
        this.account = account;
        this.balance = balance;
    }

    public void run() {
        account.deposit(balance);
    }

}
