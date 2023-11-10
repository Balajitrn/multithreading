package com.jls;

import java.util.concurrent.*;

public class CallableTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        // simulate some computation
        int result = 10 + 10;
        Thread.sleep(1000);
        return "result of the callable: "+result;
    }

    public static void main(String[] args) throws ExecutionException,InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<String> future = executorService.submit(new CallableTask());

        // Do something else while the callable is getting executed

        System.out.println("waiting for the callable result ....");
        // this line will block untill the callable return the result
        String result = future.get();

        System.out.println("Result from Callable: "+ result);

        executorService.shutdown();
    }
}
