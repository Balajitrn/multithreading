package com.jls;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++; // only one thread can execute this as a time
    }

    //synchronized method to get the count value
    public synchronized int getCount(){
        return count;
    }
}
