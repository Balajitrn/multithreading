package com.jls;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lcounter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // acquiring a lock
        try{
            count++; // section that only one thread can access at a time
        }finally {
            lock.unlock(); // releasing the lock
        }
    }

    public int getCount() {
        return count;
    }

}
