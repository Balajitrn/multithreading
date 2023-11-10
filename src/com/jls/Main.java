package com.jls;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lcounter lcounter = new Lcounter();

        // create and start two thread
        Thread t1 = new LCounterThread(lcounter);
        Thread t2 = new LCounterThread(lcounter);

        t1.start();
        t2.start();

        //wait for threads to finish
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //print the balance after deposit
        System.out.println("Final count: "+lcounter.getCount());

    }
}
