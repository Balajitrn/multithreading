package com.jls;

public class LCounterThread extends Thread{

    public Lcounter counter;

    public LCounterThread(Lcounter counter){
        this.counter = counter;
    }

    public void run() {
        counter.increment();
    }
}
