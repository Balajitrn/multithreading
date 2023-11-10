package com.jls;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        //create a thread pool with three threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Runnable task that prints the name oif the thread executing it
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello From"+ threadName);
        };

        //submit the task to the thread pool multiple times
        for(int i = 0; i < 5; i++){
            executor.submit(task);
        }

        // shutdown the executor service
        executor.shutdown();
    }
}
